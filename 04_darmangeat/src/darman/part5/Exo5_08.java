package darman.part5;
import java.util.Scanner ;

public class Exo5_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0, max = 0 ;
		int[] nbr;
		nbr = new int[20];
		
		Scanner sc = new Scanner(System.in);
		
		while (i <= nbr.length) {
		
		System.out.print("Entrez une valeur numero " + i++ + " : ");
		nbr[0] = sc.nextInt();
		
		
		
		for ( int j :  nbr ) {
			if ( j > max) {
				max = j;
			}
		}
		
		}
		
		System.out.println("la valeur la plus grande est : " + max);

		sc.close();
		
	}
}


