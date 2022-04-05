package biblio.domain;

public class Theme {
	
	private String codeTheme;
	private String libelle;
	private String parent;
	
	
	public Theme(String codeTheme, String libelle, String parent) {
		super();
		this.setCodeTheme(codeTheme);
		this.setLibelle(libelle);
		this.setParent(parent);
	}


	public String getCodeTheme() {
		return codeTheme;
	}


	public void setCodeTheme(String codeTheme) {
		this.codeTheme = codeTheme;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public String getParent() {
		return parent;
	}


	public void setParent(String parent) {
		this.parent = parent;
	}


	@Override
	public String toString() {
		return "Theme [codeTheme=" + codeTheme + ", libelle=" + libelle + ", parent=" + parent + "]";
	}
	
	

}
