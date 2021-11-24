package darman.part6;

import java.util.Scanner;

public class Exo6_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float moy = 0;
		int[] tab ;
		tab = new int[9];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tab.length; i++) {
			
	
		System.out.print("Entrez une valeur " + i + " : ");
		tab[i] = sc.nextInt();
		sc.nextLine();
		}
		
		for (int n : tab) {
		System.out.println(n);
		}
		
		for( int i = 0; i < tab.length; i++) {
			moy += tab[i];
		}
		
		  moy = moy / tab.length ;
		  
		  System.out.println("La moyenne est de : " + moy);
		  
		  sc.close();

	}

}
