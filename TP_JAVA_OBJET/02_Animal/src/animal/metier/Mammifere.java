package animal.metier;

public class Mammifere extends Animal {

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