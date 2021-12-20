package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class item_01 {

	static ArrayList<String> panier = new ArrayList<String>();

	// The ArrayList class has a regular array inside it. When an element is added,
	// it is placed into the array. If the array is not big enough, a new, larger
	// array is created to replace the old one and the old one is removed.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		content();
		showContent();
		affichage();
		choix();
	}

	private static void choix() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String rep;

		do {
			System.out.print("\nDonnez votre choix(n/q) : ");
			rep = sc.nextLine();
			if (rep.equals("q")) {
				break;
			} else if (rep.equals("n")) {
				System.out.print("Article à ajouter au panier : ");
				String article = sc.nextLine();
				panier.add(article);
			}
			showContent();
		} while (rep.equals("n"));

		sc.close();

	}

	private static void showContent() {
		// TODO Auto-generated method stub
		System.out.println("\n\tCONTENU DU CADDIE");
		System.out.println("\t---------------\n");
		
		for(int i = 0; i < panier.size(); i++) {
			System.out.println(panier.get(i));
		}

	}



	private static void affichage() {
		// TODO Auto-generated method stub

		System.out.println("\n\tPour entrer un nouvelle article : n ");
		System.out.println("\tPour sortir de l'application : q ");
	}

	private static void content() {
		// TODO Auto-generated method stub

		panier.add("pommes");
		panier.add("poires");
		panier.add("cerise");
	}

}
