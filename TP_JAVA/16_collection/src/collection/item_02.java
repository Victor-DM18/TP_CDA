package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class item_02 {

	static LinkedList<String> panier = new LinkedList<String>();

	// The LinkedList stores its items in "containers." The list has a link to the
	// first container and each container has a link to the next container in the
	// list.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		title();
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
		for(int i = 0; i < panier.size(); i++) {
			System.out.println(panier.get(i));
		}
	}

	private static void title() {
		// TODO Auto-generated method stub

		System.out.println("\tCONTENU DU CADDIE");
		System.out.println("\t---------------\n");
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

