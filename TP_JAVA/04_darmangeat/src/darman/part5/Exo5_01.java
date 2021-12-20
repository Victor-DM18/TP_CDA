package darman.part5;
import java.util.Scanner ;

public class Exo5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr ;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un chiffre entre 1 et 3 : ");
		nbr = sc.nextInt();

		while (nbr < 1 || nbr > 3) {
			System.out.print("try again : ");
			nbr = sc.nextInt();
		}
		
		System.out.println("accepted");
			sc.close();
	}

}
