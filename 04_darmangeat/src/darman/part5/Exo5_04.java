package darman.part5;

import java.util.Scanner;

public class Exo5_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr, i ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre : ");
		nbr = sc.nextInt();
		
		sc.close();
		
		i = 0 ;
		
		for (i = 1; i <= 10; i++) {
			System.out.println(nbr + i);			
		}
		
	}

}
