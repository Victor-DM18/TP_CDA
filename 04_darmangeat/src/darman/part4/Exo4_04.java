package darman.part4;
import java.util.Scanner ;

public class Exo4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr ;
		float price = 0 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Combien de photocopies avez vous effectuées ? ");
		nbr = sc.nextInt();
		if (nbr > 0 && nbr <= 10) {
			price = (float) (nbr * 0.10) ;
		}
		else
			if (nbr > 10 && nbr <=30 ) {
				price =  (float) (10 * 0.10 + (nbr - 10)*0.09) ;
			}
			else
				if (nbr > 30) {
					price = (float) (10 * 0.10 + 20 * 0.09 + (nbr - 20)*0.08) ;
				}
		sc.close();
		
		System.out.println("le prix total est de : "+price);
		

	}

}
