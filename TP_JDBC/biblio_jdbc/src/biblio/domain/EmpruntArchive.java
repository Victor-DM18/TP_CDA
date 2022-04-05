package biblio.domain;

import java.sql.Date;

public class EmpruntArchive {
	
	private int idEmpruntArchive;
	private Date dateEmprunt;
	private Date dateRestitutionEff;
	//private Exemplaire idExemplaire;
	private int idExemplaire;
	//private Utilisateur idUtilisateur;
	private  int idUtilisateur;
	
	
	
	

	
	public EmpruntArchive() {
		super();
	}



	public EmpruntArchive(int idEmpruntArchive, Date dateEmprunt, Date dateRestitutuionEff, int idExemplaire,
			int idUtilisateur) {
		
		super();
		this.idEmpruntArchive = idEmpruntArchive;
		this.dateEmprunt = dateEmprunt;
		this.dateRestitutionEff = dateRestitutuionEff;
		this.idExemplaire = idExemplaire;
		this.idUtilisateur = idUtilisateur;
	}



	/*
	 * public EmpruntArchive(int idEmpruntArchive, Date dateEmprunt, Date
	 * dateRestitutuionEff, Exemplaire idExemplaire, Utilisateur idUtilisateur) {
	 * this.setIdEmpruntArchive(idEmpruntArchive); this.setDateEmprunt(dateEmprunt);
	 * this.setDateRestitutuionEff(dateRestitutuionEff);
	 * this.setIdExemplaire(idExemplaire); this.setIdUtilisateur(idUtilisateur); }
	 */



	public int getIdEmpruntArchive() {
		return idEmpruntArchive;
	}


	public void setIdEmpruntArchive(int idEmpruntArchive) {
		this.idEmpruntArchive = idEmpruntArchive;
	}


	public Date getDateEmprunt() {
		return dateEmprunt;
	}


	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}


	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}


	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}
	
	


	/*
	 * public Exemplaire getIdExemplaire() { return idExemplaire; }
	 * 
	 * 
	 * public void setIdExemplaire(Exemplaire idExemplaire) { this.idExemplaire =
	 * idExemplaire; }
	 * 
	 * 
	 * public Utilisateur getIdUtilisateur() { return idUtilisateur; }
	 * 
	 * 
	 * public void setIdUtilisateur(Utilisateur idUtilisateur) { this.idUtilisateur
	 * = idUtilisateur; }
	 */


	public int getIdExemplaire() {
		return idExemplaire;
	}



	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}



	public  int getIdUtilisateur() {
		return idUtilisateur;
	}



	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}



	@Override
	public String toString() {
		return "\n\nid_EmpruntArchive = " + idEmpruntArchive + "\ndateEmprunt=" + dateEmprunt
				+ "\ndateRestitutuionEff = " + dateRestitutionEff + "\nidExemplaire = " + idExemplaire + "\nidUtilisateur = "
				+ idUtilisateur + "\n\n";
	}




	


}
