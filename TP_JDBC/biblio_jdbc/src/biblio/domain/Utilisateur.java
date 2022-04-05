package biblio.domain;

import java.sql.Date;
import java.util.Set;

public class Utilisateur {
	
	private int idUtilisateur;
	private String nom;
	private String prenom;
	private String pwd;
	private String pseudonyme;
	private Date dateNaissance;
	private String sexe;
	private String categorieUtilisateur;
	
	
	Set<EmpruntEnCours> emp;

	
	public Utilisateur(int idUtilisateur, String nom, String prenom, String pwd, String pseudonyme, Date dateNaissance,
			String sexe, String categorieUtilisateur) {
		
		this.setIdUtilisateur(idUtilisateur);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setPwd(pwd);
		this.setPseudonyme(pseudonyme);
		this.setDateNaissance(dateNaissance);
		this.setSexe(sexe);
		this.setCategorieUtilisateur(categorieUtilisateur);
	}


	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getPseudonyme() {
		return pseudonyme;
	}


	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public String getCategorieUtilisateur() {
		return categorieUtilisateur;
	}


	public void setCategorieUtilisateur(String categorieUtilisateur) {
		this.categorieUtilisateur = categorieUtilisateur;
	}


	@Override
	public String toString() {
		return "\n\nidUtilisateur = " + idUtilisateur + "\nnom = " + nom + "\nprenom = " + prenom + "\npwd = " + pwd
				+ "\npseudonyme = " + pseudonyme + "\ndateNaissance = " + dateNaissance + "\nsexe = " + sexe
				+ "\ncategorieUtilisateur = " + categorieUtilisateur + "\n\n";
	}
	
	
}
