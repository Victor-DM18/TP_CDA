package darman.part7;

import java.util.Scanner;

public class Exo7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur du tableau  : ");
		length = sc.nextInt();
		
		int[] tab = new int[length];
		
		for (int i = 0 ; i < length; i++) {
			System.out.print("Entrez une valeur pour l'index " + i + " : ");
			tab[i] = sc.nextInt();
		}
		
		sc.close();
		
		for( int t : tab) {
			System.out.println(t);
		}
		
		int i = 1 ;
		
		while(tab[i] == tab[i - 1] + 1 && i < (length - 1) ) {
			 i = i + 1;
		}
		
		if(tab[i] == tab[i -1 ] + 1 ) {
			System.out.print("Les nmbres sont conseecutifs");
		}else {
		System.out.print("Les nmbres ne sont pas conseecutifs");
		}
	}

}
