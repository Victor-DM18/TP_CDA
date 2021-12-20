package multiple_version;

import java.util.Scanner;

public class version_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		affichageMultiple(); //appel de la fonction 
		

		
	}
	
	private static void affichageMultiple() {
		// TODO Auto-generated method stub
		
		int nbDiv, nbMax, pageLimit = 10;

		Scanner sc = new Scanner(System.in);

		//demande d'un nombre à l'utilisateur et une limite de visualisation
		System.out.print("Entrez un nombre pour afficher son multiple : ");
		nbDiv = sc.nextInt();
		
		System.out.print("Entrez la limite des nombres visualisés : ");
		nbMax = sc.nextInt();

		sc.close();

		//boucle for pour afficher le multiple du nombre entrée
		for (int i = 0; i <= nbMax; i++) {
			if (i % nbDiv == 0) {
				System.out.print("(" + i + ")\t");
			} else {
				System.out.print(" " + i + " \t");
			}
			if (i % pageLimit == 0) {
				System.out.println();
			}
	}
	}
}


