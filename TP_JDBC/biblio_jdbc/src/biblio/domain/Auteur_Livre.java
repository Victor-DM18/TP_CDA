package biblio.domain;

public class Auteur_Livre {
	
	private String isbn;
	private Auteur idAuteur;
	private int ordreAuteur;
	
	
	public Auteur_Livre(String isbn, Auteur idAuteur, int ordreAuteur) {
		super();
		this.setIsbn(isbn);
		this.setIdAuteur(idAuteur);
		this.setOrdreAuteur(ordreAuteur);
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Auteur getIdAuteur() {
		return idAuteur;
	}


	public void setIdAuteur(Auteur idAuteur) {
		this.idAuteur = idAuteur;
	}


	public int getOrdreAuteur() {
		return ordreAuteur;
	}


	public void setOrdreAuteur(int ordreAuteur) {
		this.ordreAuteur = ordreAuteur;
	}


	@Override
	public String toString() {
		return "Auteur_Livre [isbn=" + isbn + ", idAuteur=" + idAuteur + ", ordreAuteur=" + ordreAuteur + "]";
	}
	
	

}
