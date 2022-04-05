package domain;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class ClientSelectJDBC {
	
	//private static BufferedReader console = new BufferedReader( new InputStreamReader( System.in));

	public static void main(String[] args) {
		
		Properties props = new Properties();
				try(FileReader fis = new FileReader("conf.properties")) {
					props.load(fis);
		
				Class.forName(props.getProperty("jdbc.driver.class"));
				}
				catch (ClassNotFoundException | IOException e) {
					System.out.println("Driver inconnu - " + e.getMessage());
					System.exit(1);
				}
			
			String dbUrl = props.getProperty("jdbc.url");
			String dbLogin = props.getProperty("jdbc.login");
			String dbPwd = props.getProperty("jdbc.password");
			
			
			
			try (Connection cnx = DriverManager.getConnection(dbUrl, dbLogin, dbPwd)) {
			
						
			cnx.setAutoCommit(false);

			
				System.out.println("-------------------------------------");
				System.out.println("VERIFICATION DE LA TABLE CLIENT");
				System.out.println("-------------------------------------");
				
				String req = "SELECT NOCLIENT, NOMCLIENT, NOTELEPHONE FROM CLIENT" ;
				try (PreparedStatement stmt = cnx.prepareStatement(req)) {

				
				ResultSet rs = stmt.executeQuery();					
				
				while(rs.next()) {
				System.out.println("noClient : " + rs.getInt("NOCLIENT") + "		 nomClient : " + rs.getString("NOMCLIENT") + "			noTelephone : " + rs.getString("NOTELEPHONE"));
				
				}
			
				System.out.println("-------------------------------------");
				System.out.println("VERIFICATION DE LA TABLE CLIENT");
				System.out.println("-------------------------------------");
					
				try (PreparedStatement stmt2 = cnx.prepareStatement(JOptionPane.showInputDialog("Entrez une requete"))) {

				rs = stmt2.executeQuery();
				
				
				while(rs.next()) {
					System.out.println("noClient : " + rs.getInt("NOCLIENT") + "		 nomClient : " + rs.getString("NOMCLIENT"));

				}
				
				System.out.println("\nDernière instruction du try");	
				
				}
				
			}
			catch (SQLException e) {
				System.out.println("Erreur accès DB - " + e.getMessage());
				System.exit(0);
			
			}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	}
}
			
