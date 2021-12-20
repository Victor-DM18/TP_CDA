package darman.part4;
import java.util.Scanner ;

public class Exo4_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jour, mois, annee ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ecrir un numéro de jour : ");
		jour = sc.nextInt();
		
		System.out.print("Ecrir un numéro de mois");
		mois = sc.nextInt();
		
		System.out.print("Ecrir un numéro d'annee ");
		annee = sc.nextInt();
		
		System.out.println(jour+"/"+mois+"/"+annee);
		
		
		if (jour > 0 && jour <= 31 && mois > 0 &&  mois <= 12  ) {
			System.out.println("Date valide");
		}
		else {
			System.out.println("Date non valide");
		}
		sc.close();
	}

}
