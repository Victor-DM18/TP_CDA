package darman.part3;
import java.util.Scanner ;

public class Exo3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age ;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Quelle est votre age ? : ");
		
		age = sc.nextInt() ;
		
		if ( age > 5 &&  age < 8) {
			
			System.out.println("Vous etes dans la cat�gorie Poussin");
		}
		else
			if (age > 8 && age < 10) {
				System.out.println("Vous etes dans la cat�gorie Pupille");
			}
			else
				if (age > 11 && age < 12) {
					System.out.println("Vous etes dans la cat�gorie Minime");
				}
				else
					if  (age > 11 ) {
						System.out.println("Vous etes dans la cat�gorie Cadet");
					}
		
		sc.close();
		

	}

}
