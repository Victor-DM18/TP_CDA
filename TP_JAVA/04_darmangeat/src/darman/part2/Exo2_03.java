package darman.part2;
import java.util.Scanner ;

public class Exo2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ;
		
		System.out.print("Quel est votre prénom ?: ");
		
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine() ;
		sc.close() ;
		
		System.out.println("Bonjour "+name+" !");

	}

}
