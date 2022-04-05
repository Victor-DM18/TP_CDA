package biblio.control;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JOptionPane;

import biblio.dao.ConnectionFactory;
import biblio.dao.EmpruntArchiveDAO;
import biblio.dao.EmpruntEnCoursDao;
import biblio.dao.ExemplaireDAO;
import biblio.domain.EmpruntArchive;
import biblio.domain.EmpruntEnCours;
import biblio.domain.Exemplaire;

public class Retour {
	
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
			System.out.println("VOUS ETE CONNECT� !");
			System.out.println("-------------------------------------");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		EmpruntArchiveDAO archive = new EmpruntArchiveDAO(cnx1);
		ExemplaireDAO exemplaire = new ExemplaireDAO(cnx1); 
		
		
		EmpruntArchive retour = null;
		
		
		
		try {
			System.out.println("-------------------------------------");
			System.out.println(" RETOUR D'UN EMPRUNT !");
			System.out.println("-------------------------------------");
			retour = archive.findByKey();
			System.out.println(retour);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String idExemplaire = JOptionPane.showInputDialog("Entrez l'id de l'exemplaire a rendre : ");
		int idexemplaire = Integer.parseInt(idExemplaire);
		
		Date time = new Date(System.currentTimeMillis());
		
	
	
		
		EmpruntArchive in = new EmpruntArchive(retour.getIdEmpruntArchive(), retour.getDateEmprunt(), time, idexemplaire, retour.getIdUtilisateur());
		EmpruntArchive in2 = new EmpruntArchive();
		
		
		System.out.println("-------------------------------------");
		System.out.println( "EFFACER UN EMPRUNT");
		System.out.println("-------------------------------------");
		


		  

		  
		  try { archive.insertArchive(in);
		  System.out.println("Emprunt archiv� ");
		  } catch (SQLException e)
		  { // TODO Auto-generated
		   e.printStackTrace(); }
		  
		  ArrayList<EmpruntArchive> listeArchive = new ArrayList<EmpruntArchive>();

		  
			try {
				listeArchive = archive.findAll();
				System.out.println(listeArchive);

			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

		  

		  
		  
		  
		  System.out.println("-------------------------------------");
			System.out.println(" EMPRUNT_EN_COURS AVANT DELETE !");
			System.out.println("-------------------------------------");

			ArrayList<EmpruntEnCours> listEmprunt = new ArrayList<EmpruntEnCours>();

			try {
				listEmprunt = archive.findAll2();
				System.out.println(listEmprunt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		try {
			archive.DeleteEmprunt(in);
			
			System.out.println("emprunt effac� ");
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("-------------------------------------");
		System.out.println(" EMPRUNT_EN_COURS !");
		System.out.println("-------------------------------------");

		 listEmprunt = new ArrayList<EmpruntEnCours>();


		try {
			listEmprunt = archive.findAll2();
			System.out.println(listEmprunt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<Exemplaire> listExemplaire = new ArrayList<Exemplaire>();
		

        Exemplaire delete = new Exemplaire(idexemplaire, null, null, null);		
		try {
			archive.UpdateExemplaire(delete);
			listExemplaire = exemplaire.findAll();
			System.out.println(listExemplaire);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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