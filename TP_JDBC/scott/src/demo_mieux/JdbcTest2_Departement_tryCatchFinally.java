package demo_mieux;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest2_Departement_tryCatchFinally {
public static void main(String[] args)  {
	
// Charger la première classe du driver
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
	System.out.println("Driver non présent dans le CLASSPATH  -  " + e.getMessage());
	System.exit(1);
}


//Ouvrir une connexion dite "réseau"  ( vs DataSource)
 

try (Connection cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "scott", "scott")){

	Statement stmt = null;
	ResultSet rs = null; 

try {
	stmt = cnx.createStatement() ;

	
	//On souhaite faire une transaction
	cnx.setAutoCommit(false);
		
	
	//Insertion d'une ligne dans la table DEPT
	///////////////////////////////////////
 	//à la cnx, on demande  un statement

	 int nbLignesImpactees = stmt.executeUpdate("INSERT INTO DEPT(DEPTNO, DNAME, LOC) VALUES (51, 'FORMATION', 'Montreuil')");
	

	System.out.println("Retour de l'executeUpdate :" + nbLignesImpactees);		
	System.out.println();
	
	//Affichage du contenu de la table DEPT
	///////////////////////////////////////
	  rs = stmt.executeQuery("SELECT DEPTNO, DNAME, LOC FROM DEPT");
	
//		rs.next(); //ne pas oublier le premier next
//		System.out.println("DEPTNO :"+ rs.getInt("DEPTNO")+" DNAME :" + rs.getString("DNAME")+" LOC :" +rs.getString(3));
//		rs.next();
//		System.out.println("DEPTNO :"+ rs.getString(1)+" DNAME :" + rs.getString("DNAME")+" LOC :" +rs.getString(3));
//		
	//mieux
	while(rs.next()){
		System.out.println("DEPTNO :"+ rs.getInt("DEPTNO")+" DNAME :" + rs.getString("DNAME")+" LOC :" +rs.getString(3));
	}

	System.out.println("\nOn rembobine car c'est un test");
	cnx.rollback();
	
			
}
 catch (SQLException e) {
	System.out.println("Pb JDBC  -  " + e.getMessage());
}
}catch (SQLException e) {
			System.out.println("Pb pour atteindre la BD  -  " + e.getMessage());
			System.exit(2);
			}


}}
