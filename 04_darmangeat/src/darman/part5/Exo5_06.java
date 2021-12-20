package darman.part5;

import java.util.Scanner;

public class Exo5_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr, i, n ;
		
		n = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre : ");
		nbr = sc.nextInt();
		
		sc.close();

		
		 i = 1 ;
		
		while ( i <= nbr) {
			n += i++ ;
		}
			System.out.println( n );
		
	}

}
