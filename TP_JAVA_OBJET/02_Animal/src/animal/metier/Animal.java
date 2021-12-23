package animal.metier;

public class Animal implements nommable, Comparable<Animal> {

		private String nom;
		String parle ;

		public Animal() {
			super();
		}
		
		public Animal(String nom) {
		
			this.setNom(nom);
		}
		
		public String parle() {
			return "brrrrr";
		}
		
		void setNom(String nom) {
			if (nom.length() > 15) {
				throw new AnimalException("Out of limit nom.length (15)");
				/*
				 * throw new UnsupportedOperationException("Out of limit nom.length (15)");
				 */			}else {
			this.nom = nom ;
			}
		}
		
		public String getNom() {
			return nom;
		}
		
		public int compareTo(Animal a) {
			return getNom().compareTo(a.getNom());
		}
	
		@Override
		public String toString() {
			
			
			/*
			 * if (nom == null) { return "Je suis un animal. "; }else { return
			 * "Je suis un animal de nom " + getNom() + parle() ; }
			 */
			
			
			return getNom() + " parle : " + parle();
			
			
			
		}
			

		}
		
		 class AnimalException extends RuntimeException {
			/**
			 * 
			 */
			private static final long serialVersionUID = 8768928968924924158L;

			public  AnimalException() {}	
			public  AnimalException( String exception) {
				 super(exception);
			 }
}
