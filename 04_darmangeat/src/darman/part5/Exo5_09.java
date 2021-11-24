package darman.part5;

import java.util.Scanner;

public class Exo5_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0, max = 0 ;
		int nbr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.print("Entrez une valeur numero " + i++ + " : ");
		nbr = sc.nextInt();
		
		if ( nbr > max) {
			max = nbr;
		}

		}while(nbr != 0);
		
		
		
					
		
		System.out.println("la valeur la plus grande est : " + max);

		sc.close();
		

	}

}
