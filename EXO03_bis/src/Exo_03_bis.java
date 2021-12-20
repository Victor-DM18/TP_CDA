import java.util.Scanner;
import fr.afpa.outils.*;
public class Exo_03_bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner (System.in);
	    String nom, prenom, adresse, FNTE, rep;
	    String[] cheval ;
	    cheval = new String[3];
	    
	    Console c ;

	    do {
	      System.out.println("Nom du cavalier: ");
	      nom = sc.nextLine();
	      System.out.println("Prenom du cavalier: ");
	      prenom = sc.nextLine();
	      System.out.println("Adresse du cavalier: ");
	      adresse = sc.nextLine();
	      System.out.println("Cheval preferes: ");
	      cheval[0] = sc.nextLine();
	      for (int i = 1; i < cheval.length; i++ ) {
	        System.out.print("Cheval preferes: ");
	        cheval[i] = sc.nextLine();
	      }
	      System.out.println("No carte FNTE: ");
	      FNTE = sc.nextLine();

	      System.out.print("\n\nCavalier no : ");
	      System.out.println("\t" + FNTE);
	      System.out.println("\t" + prenom + " "  + nom.toUpperCase());
	      System.out.println("\t" + adresse);
	      System.out.print("\tcheval: ");
	      for (int i = 0; i < cheval.length; i++) {
	        System.out.print(" " + cheval[i]);
	      }
	      
	 
	      System.out.println("\n\nVoulez-vous continuer (O/N)? ");
	      rep = sc.nextLine();

	      while (!rep.equals("o") && !rep.equals("n")) {
	          System.out.println("Voulez-vous continuer (O/N)? ");
	          rep = sc.nextLine();
	      }
	      
	    
	  }
	    while (rep == "O");

	    sc.close();
	}

}
