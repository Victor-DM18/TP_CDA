package domain;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ExempleTraitementDuTemps {

	public static void main(String[] args) {

		Properties props = new Properties();
		try (FileReader fis = new FileReader("conf.properties")) {
			props.load(fis);

			Class.forName(props.getProperty("jdbc.driver.class"));
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Driver inconnu - " + e.getMessage());
			System.exit(1);
		}

		String dbUrl = props.getProperty("jdbc.url");
		String dbLogin = props.getProperty("jdbc.login");
		String dbPwd = props.getProperty("jdbc.password");

		try (Connection cnx = DriverManager.getConnection(dbUrl, dbLogin, dbPwd)) {

			cnx.setAutoCommit(false);

			System.out.println("-------------------------------------");
			System.out.println("VOUS ETE CONNECT� !");
			System.out.println("-------------------------------------");

			String init = "DROP TABLE Letemps";
			String req = "CREATE TABLE LeTemps" +
					"(id INTEGER NOT NULL, "+
							"laDate DATE," +
					"Heure DATE,"+
							"laDateEtHeure DATE,"+
					"laDateEtHeure2 TIMESTAMP(3))";
			String sql = " INSERT INTO LeTemps VALUES(1, sysdate, sysdate, sysdate, sysdate)";
			String req2 = "SELECT   * FROM LeTemps" ;


			try (PreparedStatement stmt0 = cnx.prepareStatement(init)) {
				stmt0.executeUpdate();
			
			      System.out.println("Table effac�e avec succ�s...");
			
			
			try (PreparedStatement stmt = cnx.prepareStatement(req)) {
				stmt.executeUpdate();	
				
			
				System.out.println("-------------------------------------");
				System.out.println("VERIFICATION DE LA TABLE LeTemps");
				System.out.println("-------------------------------------");
				

				      System.out.println("Table cr��e avec succ�s...");

				      try (PreparedStatement stmt1 = cnx.prepareStatement(sql)) {				      
				    	  stmt1.executeUpdate();
				    	  
					      System.out.println("Data cr�es avec succ�s...");

				      
							try (PreparedStatement stmt2 = cnx.prepareStatement(req2)) {

				
				ResultSet rs = stmt2.executeQuery();	
				
				while(rs.next()) {
					System.out.println("id : " + rs.getInt("id") 
					+ "		 laDate : " + rs.getString("laDate") 
					+ "			Heure : " + rs.getString("Heure")
					+ "			laDateEtHeure : " + rs.getString("laDateEtHeure")
					+ "			laDateEtHeure2 : " + rs.getString("laDateEtHeure2"));

				}
				
				cnx.rollback();
				}
			}
		} catch (SQLException e) {
			System.out.println("Erreur acc�s DB - " + e.getMessage());
			System.exit(0);
		}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}
