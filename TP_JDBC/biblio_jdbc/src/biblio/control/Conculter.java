package biblio.control;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;


import biblio.dao.ConnectionFactory;
import biblio.dao.ExemplaireDAO;
import biblio.dao.UtilisateurDao;
import biblio.domain.Exemplaire;
import biblio.domain.Utilisateur;

public class Conculter {

	private String driver, url, user, pwd;

	public static void main(String[] args) {

		Properties props = new Properties();
		try (FileReader fis = new FileReader("biblio.properties")) {
			props.load(fis);

			Class.forName(props.getProperty("driver"));
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Driver inconnu - " + e.getMessage());
			System.exit(1);
		}

		String dbDriver = props.getProperty("driver");
		String dbUrl = props.getProperty("url");
		String dbLogin = props.getProperty("user");
		String dbPwd = props.getProperty("pwd");

		ConnectionFactory cf = new ConnectionFactory();

		Connection cnx1 = null;

		try {               	
			cnx1 = cf.getConnectionSansAutoCommit(dbDriver, dbUrl, dbLogin, dbPwd);
			System.out.println("-------------------------------------");
			System.out.println("VOUS ETE CONNECTÉ !");
			System.out.println("-------------------------------------");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ExemplaireDAO exDAO = new ExemplaireDAO(cnx1);
		Exemplaire ex = null;
		ArrayList<Exemplaire> listeExemplaire = new ArrayList<Exemplaire>();
		listeExemplaire = null;

		try {

			System.out.println("-------------------------------------");
			System.out.println(" EXEMPLAIRE !");
			System.out.println("-------------------------------------");

			ex = exDAO.findByKey();
			listeExemplaire = exDAO.findAll();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(ex);

		System.out.println(listeExemplaire);

		UtilisateurDao uiDAO = new UtilisateurDao(cnx1);
		Utilisateur ui = null;

		ArrayList<Utilisateur> listeUtilisateur = new ArrayList<Utilisateur>();
		listeExemplaire = null;

		System.out.println("-------------------------------------");
		System.out.println(" UTILISATEUR !");
		System.out.println("-------------------------------------");

		ui = uiDAO.findByKey();
		listeUtilisateur = uiDAO.findAll();

		System.out.println(ui);
		
		System.out.println("-------------------------------------");

		System.out.println(listeUtilisateur);



		/*
		 * try (Connection cnx1 = DriverManager.getConnection(dbUrl, dbLogin, dbPwd)) {
		 * 
		 * cnx1.setAutoCommit(false);
		 * 
		 * System.out.println("-------------------------------------");
		 * System.out.println("VOUS ETE CONNECTÉ !");
		 * System.out.println("-------------------------------------");
		 * 
		 * 
		 * ExemplaireDAO exDAO = new ExemplaireDAO(cnx1);
		 * 
		 * Exemplaire ex = null;
		 * 
		 * ex = exDAO.findByKey(3);
		 * 
		 * 
		 * 
		 * }
		 */

		/*
		 * }
		 * 
		 * catch (SQLException e) { System.out.println("Erreur accès DB - " +
		 * e.getMessage()); System.exit(0);
		 * 
		 * }
		 */

	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
