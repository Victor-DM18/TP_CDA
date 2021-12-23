package animal.metier;

import java.io.Serializable;

public class Chien extends Mammifere implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1869251999902573620L;


	public Chien(String nom) {
		super(nom);
	}
	
	

	@Override
	public String toString() {
		
		/*
		 * if (this.getNom() == null) { return "Je suis un chien. "; }else { return
		 * "Je suis un chien de nom " + getNom() ; }
		 */
		
		return getNom() + " parle : " + parle();
	
	}
	
	@Override
	public String parle() {
		return "wouaf wouaf";
	}

}
