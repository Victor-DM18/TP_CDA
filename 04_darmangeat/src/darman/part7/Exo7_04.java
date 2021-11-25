package darman.part7;

import java.util.Scanner;
import java.util.Arrays; class Exo7_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab = {12, 8, 4, 45, 64, 9, 2};
		int nb;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez l'index du tabeau à supprimer : ");
		nb = sc.nextInt();
		
		sc.close();
		
		for( int i = nb; i < tab.length - 1; i++ ) {
			tab[i] = tab[i + 1];
			
		}
		
	}

}
