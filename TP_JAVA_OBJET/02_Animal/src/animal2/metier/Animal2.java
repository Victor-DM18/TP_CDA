package animal2.metier;


public class Animal2 {


	protected String nom;

	public Animal2() {
		super();
	}
	
	public Animal2(String nom) {
	
		this.setNom(nom);
	}
	
	void setNom(String nom) {
		this.nom = nom ;
	}
	
	String getNom() {
		return nom;
	}
	
	public int compareTo(Animal2 a) {
		return getNom().compareTo(a.getNom());
	}

	@Override
	public String toString() {
		
		if (nom == null) {
			return "Je suis un animal. ";
		}else {
			return "Je suis un animal de nom " +  getNom() ;
		}
	}

}
