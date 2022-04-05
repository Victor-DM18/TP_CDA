package biblio.domain;

public class Livre {
	
	private String isbn;
	private String titre;
	private int anneeParution;
	private int nbPage;
	private Editeur idEditeur;
	private Theme codeTheme;
	
	
	public Livre(String isbn, String titre, int anneeParution, int nbPage, Editeur idEditeur, Theme codeTheme) {
		super();
		this.setIsbn(isbn);
		this.setTitre(titre);
		this.setAnneeParution(anneeParution);
		this.setNbPage(nbPage);
		this.setIdEditeur(idEditeur);
		this.setCodeTheme(codeTheme);
	}
	
	


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public int getAnneeParution() {
		return anneeParution;
	}


	public void setAnneeParution(int anneeParution) {
		this.anneeParution = anneeParution;
	}


	public int getNbPage() {
		return nbPage;
	}


	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}


	public Editeur getIdEditeur() {
		return idEditeur;
	}


	public void setIdEditeur(Editeur idEditeur) {
		this.idEditeur = idEditeur;
	}


	public Theme getCodeTheme() {
		return codeTheme;
	}


	public void setCodeTheme(Theme codeTheme) {
		this.codeTheme = codeTheme;
	}


	@Override
	public String toString() {
		return "Livre [isbn=" + isbn + ", titre=" + titre + ", anneeParution=" + anneeParution + ", nbPage=" + nbPage
				+ ", idEditeur=" + idEditeur + ", codeTheme=" + codeTheme + "]";
	}
	
	

}
