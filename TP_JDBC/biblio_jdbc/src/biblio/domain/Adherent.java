package biblio.domain;

import java.sql.Date;

public class Adherent extends Utilisateur{


	private String telephone;
	
	

	
	public Adherent(int idUtilisateur, String nom, String prenom, String pwd, String pseudonyme, Date dateNaissance,
			String sexe, String categorieUtilisateur, String telephone) {
		super(idUtilisateur, nom, prenom, pwd, pseudonyme, dateNaissance, sexe, categorieUtilisateur);
		this.telephone = telephone;
	}


	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "\n\n------------------ \n\nTelephone = " + getTelephone() + super.toString() ;
	}


	
	
}
