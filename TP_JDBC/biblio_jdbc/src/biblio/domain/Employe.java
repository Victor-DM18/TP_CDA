package biblio.domain;

import java.sql.Date;

public class Employe extends Utilisateur {
	
	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;
	



	public Employe(int idUtilisateur, String nom, String prenom, String pwd, String pseudonyme, Date dateNaissance,
			String sexe, String categorieUtilisateur, String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(idUtilisateur, nom, prenom, pwd, pseudonyme, dateNaissance, sexe, categorieUtilisateur);
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
	}

	public String getCodeMatricule() {
		return codeMatricule;
	}

	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}

	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}

	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}

	@Override
	public String toString() {
		return "\n\n--------------\n\nMatricule = " + getCodeMatricule() + "\nCategorie = " + getCategorieEmploye() + super.toString();
	}

	
	
	

}
