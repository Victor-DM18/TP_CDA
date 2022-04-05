package domain;
import java.sql.*;


public class ClientInsertJDBC {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection cnx = null;
			
			try {
				cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost/xepdb1", "livraison", "livraison");
				
				
				Statement stmt = null;
				ResultSet rs = null;
				
				try {
					String requete;
					
					
					cnx.setAutoCommit(false);
					
					stmt = cnx.createStatement();
					
					System.out.println("-------------------------------------");
					System.out.println("VERIFICATION DE LA TABLE CLIENT");
					System.out.println("-------------------------------------");
					
					
					rs = stmt.executeQuery("SELECT NOCLIENT, NOMCLIENT, NOTELEPHONE FROM CLIENT");					
					
					while(rs.next()) {
					System.out.println("noClient : " + rs.getInt("NOCLIENT") + "		 nomClient : " + rs.getString("NOMCLIENT") + "			noTelephone : " + rs.getString("NOTELEPHONE"));
					}
					
					
					
					System.out.println("-------------------------------------");
					System.out.println("AJOUT D'UN NOUVEAU CLIENT");
					System.out.println("-------------------------------------");
					

					
					
					requete = "INSERT INTO CLIENT (NOCLIENT, NOMCLIENT, NOTELEPHONE) VALUES (101, 'G. Lemoyne', '911')"; 
							
					int ajoutClient = stmt.executeUpdate(requete);
					
					System.out.println("\n Retour de l'executeUpdate : " + ajoutClient);

					
							
					System.out.println("\n-------------------------------------");
					System.out.println("VERIFICATION DE LA TABLE CLIENT");
					System.out.println("-------------------------------------");
					
					
					rs = stmt.executeQuery("SELECT NOCLIENT, NOMCLIENT, NOTELEPHONE FROM CLIENT");					
					
					while(rs.next()) {
					System.out.println("noClient : " + rs.getInt("NOCLIENT") + "		 nomClient : " + rs.getString("NOMCLIENT") + "			noTelephone : " + rs.getString("NOTELEPHONE"));
					}
					
					
					System.out.println("\nOn rembobine car c'est un test");
					cnx.rollback();
					
					
					System.out.println("\nDernière instruction du try");	
				} catch (SQLException ex) {
					ex.printStackTrace();
					//System.out.println("Erreur SQLException: " + e.getMessage());
				}
				}
				catch (SQLException ex) {
					System.out.println("Pb pour atteindre la BD  -  " + ex.getMessage());
					System.exit(2);
				}
				} catch (ClassNotFoundException ex) {
					System.out.println("Driver non présent dans le CLASSPATH  -  " + ex.getMessage());
					System.exit(1);
				}
				}
			
		
	}


