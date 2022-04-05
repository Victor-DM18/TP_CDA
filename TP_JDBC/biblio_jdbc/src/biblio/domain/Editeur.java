package biblio.domain;

public class Editeur {
	
	private int idEditeur;
	private String nom;
	private String prenom;
	
	
	public Editeur(int idEditeur, String nom, String prenom) {
		super();
		this.setIdEditeur(idEditeur);
		this.setNom(nom);
		this.setPrenom(prenom);
	}


	public int getIdEditeur() {
		return idEditeur;
	}


	public void setIdEditeur(int idEditeur) {
		this.idEditeur = idEditeur;
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
		return "Editeur [idEditeur=" + idEditeur + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	

}
