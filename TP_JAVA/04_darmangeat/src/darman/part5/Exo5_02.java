package darman.part5;
import java.util.Scanner ;

public class Exo5_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre entre 10 et 20 : ");
		nbr = sc.nextInt();
		
		while (nbr < 10 || nbr > 20) {
			if (nbr < 10) {
				System.out.println("nombre trop petit !");
				System.out.print("Entrez un nombre entre 10 et 20 : ");
				nbr = sc.nextInt();
			}
			else 
				if (nbr > 20) {
					System.out.println("nombre trop grand !");
					System.out.print("Entrez un nombre entre 10 et 20 : ");
					nbr = sc.nextInt();
				}
		}
		
		System.out.println(nbr + " est valide");
		
		sc.close();

	}

}
