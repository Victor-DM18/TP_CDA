package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class item_03 {

	static List<String> panier = new ArrayList<String>();
	
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
