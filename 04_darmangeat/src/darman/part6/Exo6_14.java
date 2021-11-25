package darman.part6;

import java.util.Scanner;

public class Exo6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur du tableau  : ");
		length = sc.nextInt();
		
		int[] note = new int[length];
		
		for (int i = 0 ; i < length; i++) {
			System.out.print("Entrez une valeur pour l'index " + i + " : ");
			note[i] = sc.nextInt();
		}
		
		sc.close();
		
		int som =0;
		
		for(int i = 0; i < length; i++) {
			som = som += note[i];
		}
		
		int moy = som / length;
		
		System.out.println("La moyenne est de : " + moy);
		
		int noteSup = 0;
		
		for( int i = 0; i < length; i++) {
			if( note[i] > moy) {
				noteSup = noteSup + 1 ;
			}
		}
		
		System.out.println("Le nombre de note superieur a la moyenne est de : " + noteSup);
	}

}
