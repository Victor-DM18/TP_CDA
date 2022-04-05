package biblio.control;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

import javax.swing.JOptionPane;

import biblio.dao.ConnectionFactory;
import biblio.dao.EmpruntEnCoursDao;
import biblio.domain.EmpruntEnCours;

public class Emprunter {

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

		EmpruntEnCoursDao insert = new EmpruntEnCoursDao(cnx1);

		System.out.println("-------------------------------------");
		System.out.println(" EMPRUNT_EN_COURS !");
		System.out.println("-------------------------------------");

		ArrayList<EmpruntEnCours> listEmprunt = new ArrayList<EmpruntEnCours>();

		try {
			listEmprunt = insert.findAll();
			System.out.println(listEmprunt);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String idUtilisateur = JOptionPane.showInputDialog("Entrez l'id de l'utilisateur qui emprunte");
		int idutilisateur = Integer.parseInt(idUtilisateur);

		String idExemplaire = JOptionPane.showInputDialog("Entrez l'id de l'exemplaire a emprunter");
		int idexemplaire = Integer.parseInt(idExemplaire);

		Date dateEmprunt = new Date(System.currentTimeMillis());

		String idExemplaire2 = JOptionPane.showInputDialog("Entrez l'id de l'exemplaire a emprunter");
		int idexemplaire2 = Integer.parseInt(idExemplaire2);

		// String idUtilisateur2 = JOptionPane.showInputDialog("Entrez l'id de
		// l'utilisateur qui emprunte");
		// int idutilisateur2 = Integer.parseInt(idUtilisateur2);

		Date dateEmprunt2 = new Date(System.currentTimeMillis());

		String idExemplaire3 = JOptionPane.showInputDialog("Entrez l'id de l'exemplaire a emprunter");
		int idexemplaire3 = Integer.parseInt(idExemplaire3);

		// String idUtilisateur3 = JOptionPane.showInputDialog("Entrez l'id de
		// l'utilisateur qui emprunte");
		// int idutilisateur3 = Integer.parseInt(idUtilisateur3);

		Date dateEmprunt3 = new Date(System.currentTimeMillis());

		EmpruntEnCours emprunt = new EmpruntEnCours(idexemplaire, idutilisateur, dateEmprunt);
		EmpruntEnCours emprunt2 = new EmpruntEnCours(idexemplaire2, idutilisateur, dateEmprunt2);
		EmpruntEnCours emprunt3 = new EmpruntEnCours(idexemplaire3, idutilisateur, dateEmprunt3);

		try {

			System.out.println("-------------------------------------");
			System.out.println(" CREATION D'UN EMPRUNT D'UN EXEMPLAIRE !");
			System.out.println("-------------------------------------");

			listEmprunt = insert.findAll();
			int count = Collections.frequency(listEmprunt, idutilisateur);

			if (count >= 3) {

				throw new Exception("3 emprunt maximum !!!");
			} else {
				insert.insertEmpruntEnCours(emprunt);

				System.out.println(emprunt);
			}

			System.out.println("-------------------------------------");

			if (count >= 3) {

				throw new Exception("3 emprunt maximum !!!");
			} else {
				insert.insertEmpruntEnCours(emprunt2);

				System.out.println(emprunt2);

			}
			System.out.println("-------------------------------------");

			if (count >= 3) {

				throw new Exception("3 emprunt maximum !!!");
			} else {
				insert.insertEmpruntEnCours(emprunt3);

				System.out.println(emprunt3);

			}

			// System.out.println("Emprunt créé : " +
			// insert.findByKey(emprunt.getIdExemplaire()));

			System.out.println("\n EMPRUNT confirmé !");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("-------------------------------------");
			System.out.println(" EMPRUNT PAR ID_EXEMPLAIRE !");
			System.out.println("-------------------------------------");
			emprunt = insert.findByKey();
			System.out.println(emprunt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("-------------------------------------");
		System.out.println(" EMPRUNT_EN_COURS !");
		System.out.println("-------------------------------------");

		try {
			listEmprunt = insert.findAll();
			int count = Collections.frequency(listEmprunt, 1);

			System.out.println(listEmprunt);
			System.out.println("count = " + count);

		} catch (SQLException e) {
			e.printStackTrace();
		}

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
