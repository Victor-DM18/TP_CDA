package animal2.metier;

public class Homme2 extends Mammifere {

	public Homme2() {
		super();
	}
	
	public Homme2( String nom) {
		super(nom);
	}

	
	@Override
	public String toString( ) {
		
			return super.toString() + "Je suis un homme ";
		
	}
	
}
