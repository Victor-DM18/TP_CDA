package bookstore.test;
import bookstore.metier.Exo_02_Livre;

public class Exo_03_TestLivre {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Exo_02_Livre l1 = new Exo_02_Livre("Victor", "FakeDev", 54, 10);
		System.out.println("Le livre l1 : " + l1);
		System.out.println();

		l1.afficheToi();
		System.out.println();
		
		Exo_02_Livre l2 = new Exo_02_Livre("Dos Martires", "Clown", 18, 0);
		System.out.println("Le livre l2 : " + l2);
		System.out.println();

		l2.afficheToi();
		System.out.println();
		
		int som =l1.getNbPages() + l2.getNbPages();
		System.out.println("Somme des pages : " + som);
		System.out.println();
		
		System.out.println("comparaison : " + l1.compare(l2));
		System.out.println();

		
		/*
		 * Return message : "prix imposible"
		 * 
		 * Exo_02_Livre l5 = new Exo_02_Livre("Dos Martires", "Clown", 8, -23);
		 * System.out.println("Le livre l5 : " + l5); System.out.println();
		 */		
		
		Exo_02_Livre l4 = new Exo_02_Livre("Victor HUGO", "`les Misérables", 300);
		System.out.println();
		

		l4.afficheToi();
		System.out.println();

		/*
		 * Return message : "error page number"
		 * 
		 * Exo_02_Livre l3 = new Exo_02_Livre("Victor", "trueDev", 0);
		 * System.out.println("Le livre l3 : " + l3); System.out.println();
		 */
		
		
	
	}


}