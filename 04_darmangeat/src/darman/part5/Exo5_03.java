package darman.part5;
import java.util.Scanner;

public class Exo5_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbr, i ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre : ");
		nbr = sc.nextInt();
		
		i = 0 ;
		
		while (i <= 10) {
			System.out.println(nbr + i++);
			
		}
		
		sc.close();
	}

}
