package animal.metier;

public class Homme extends Animal {

	public Homme() {
		super();
	}
	
	public Homme( String nom) {
		super(nom);
	}

	
	@Override
	public String toString( ) {
		
		/*
		 * if (this.getNom() == null) { return "Je suis un homme. "; }else { return
		 * "Je suis un homme de nom " + getNom() ; }
		 */
		
		return getNom() + " parle : " + parle();
	}
	
	@Override
	public String parle() {
		return "Vive le polymorphisme";
		
	}
	
}
