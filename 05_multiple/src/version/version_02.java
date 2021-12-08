package version;

import java.util.Scanner;

public class version_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbDiv, nbMax, pageLimit = 10;

		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez un nombre pour afficher son multiple : ");
		nbDiv = sc.nextInt();

		System.out.print("Entrez la limite des nombres visualisés : ");
		nbMax = sc.nextInt();

		sc.close();


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
