package darman.part4;
import java.util.Scanner ;

public class Exo4_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age ;
		String genre ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("votre genre (h/f) ? ");
		genre = sc.nextLine();
		System.out.print("Quelle est votre age ? ");
		age = sc.nextInt();		
		sc.nextLine();
		
		
		if (age >= 20 && genre.equals("h")) {
			System.out.println("Vous etes imposable");
		}
		else
			if (age >= 18 && age <= 35 && genre.equals("f")) {
		
			System.out.println("Vous etes imposable");
		}
		else {
			System.out.println("Vous n'etes pas imposable");
		}
		
		sc.close();
	}

}
