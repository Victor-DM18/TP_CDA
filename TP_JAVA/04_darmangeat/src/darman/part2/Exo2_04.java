package darman.part2;
import java.util.Scanner ;

public class Exo2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float prixHT, nb, TVA, TTC ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Prix HT ? : ");
		prixHT = sc.nextFloat();
		
		System.out.print("Nombre d'artcles ? : ");
		nb = sc.nextFloat();
		
		System.out.println("Le prix total HT est de "+prixHT*nb);
		
		System.out.print("Quelle est le taux de TVA en % ? : ");
		TVA = sc.nextFloat();

		sc.close();
		
		TTC = (prixHT*nb)*(1+TVA/100);
		
		System.out.println("Le prix TTC est de  : "+TTC);
	}

}
