package demo_mieux;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest1_Statement_ResultSet {

	public static void main(String[] args) throws  SQLException, ClassNotFoundException    {
		// TODO Auto-generated method stub
		
		// Changer la premiere class du Drive
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Ouvrir une connexion dite "reseau" ( vs DataSource)
		Connection cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "scott", "scott");
		
		//On souhaite faire une transaction
		cnx.setAutoCommit(false);
		
		//Insertion d'une ligne dans la table DEPT
		//////////////////////////////////////////
		
		//à la cnx, on demande un statement
		Statement stmt = cnx.createStatement();
		
		int nbLignesImpactees = stmt.executeUpdate("INSERT INTO DEPT(DEPTNO, DNAME, LOC) VALUES (50, 'FORMATION', 'Montreuil')");
		System.out.println("Retour de l'executeUpdate : " + nbLignesImpactees);
		
		//Affichage du contenu de la table DEPT
		////////////////////////////////////////
		
		ResultSet rs = stmt.executeQuery("SELECT DEPTNO, DNAME, LOC FROM DEPT");
		
		// rs.next(); // ne pas oublier le premier next
		// System.out.println("DEPTNO : " + rs.getInt("DEPTNO") + "DNAME : " + rs.getSTring("DNAME") + " LOC : " + rs.getString(3));
		// rs.next();
		//Sstem.ou.println("DEPTNO : " + rs.getString(1) + "DNAME : " + rs.getString("DNAME") + " LOC : " + rs.getString(3));
		// ...etc
		
		//mieux
		
		while( rs.next() ) {
				System.out.println("DEPTNO :" + rs.getString("DEPTNO") + "DNAME : " + rs.getString("DNAME") + "LOC : " + rs.getString(3));
				System.out.println("DEPTNO :" + rs.getInt("DEPTNO") + "DNAME : " + rs.getString("DNAME") + "LOC : " + rs.getString(3));

		}
		
		//Liberation des ressources
		///////////////////////////
		
		rs.close();
		stmt.close();
		
		System.out.println("\nOn rembobiner car c'est un test");
		cnx.rollback();
		
		//Liberation des ressources
		///////////////////////////
		
		cnx.close();
	}

}

