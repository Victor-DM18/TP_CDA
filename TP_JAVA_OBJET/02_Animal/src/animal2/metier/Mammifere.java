package animal2.metier;

public class Mammifere extends Animal2 {

	public Mammifere() {
		super();
	}
	
	public Mammifere(String nom) {
		super(nom);
	}

	@Override
	
	public String toString() {
		
			return super.toString() +  "Je suis un mammifère ";
	
	}
}