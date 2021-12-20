package bookstore.metier;

public class Exo_01_Livre {
	//VARIABLE
	
	private String titre, auteur;
	private int nbPages ;
	
	Exo_01_Livre(String auteur, String titre, int nbPages) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages = nbPages;
	}
	

	
	@Override
	public String toString() {
		return "Livre [auteur : " + auteur + "]";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exo_01_Livre l1 = new Exo_01_Livre("Victor", "FakeDev", 54);
		System.out.println("Le livre l1 : " + l1);
		System.out.println();
		
		Exo_01_Livre l2 = new Exo_01_Livre("Dos Martires", "Clown", 45);
		System.out.println("Le livre l2 : " + l2);
		
	}



}
