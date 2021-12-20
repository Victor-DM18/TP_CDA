package darman.part3;

import java.util.Scanner;

public class Exo3_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nbTotal ;
		double[] nb;
		nb = new double[2] ;
		
		System.out.print("Ecrivez un nombre : ");
		Scanner sc = new Scanner(System.in);
		nb[0] = sc.nextFloat();
		for(int i=1; i<nb.length; i++) {
			System.out.print("Ecrivez un nombre : ");
			nb[i] = sc.nextFloat();
		};
		
		
		if(nb[0]==0) {
			System.out.println("null");
		}		
		else
		if(nb[0]>0) {
		System.out.println(nb[0]+" est positif");
		}
		else 
		{System.out.println(nb[0]+" est négatif");
		}
		
		if(nb[1]==0) {
			System.out.println("null");
		}
			else
		if(nb[1]>0) {
			System.out.println(nb[1]+" est positif");
			}
			else 
			{System.out.println(nb[1]+" est négatif");
			}
		
		nbTotal = nb[0] * nb[1];
		
		if ( nbTotal == 0 ) {
			System.out.println("null");
		}
		else 
			if (nbTotal > 0) {
				System.out.println(nbTotal+" est positif");
				}
				else 
				{System.out.println(nbTotal+" est négatif");
				}
		
		sc.close();
	}

}
