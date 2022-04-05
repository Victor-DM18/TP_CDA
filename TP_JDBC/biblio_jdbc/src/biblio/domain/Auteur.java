package biblio.domain;

public class Auteur {
	
	private int idAuteur;
	private String nom;
	private String prenom;
	
	public Auteur(int idAuteur, String nom, String prenom) {
		super();
		this.setIdAuteur(idAuteur);
		this.setNom(nom);
		this.setPrenom(prenom);
	}

	public int getIdAuteur() {
		return idAuteur;
	}

	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
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

	@Override
	public String toString() {
		return "Auteur [idAuteur=" + idAuteur + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
