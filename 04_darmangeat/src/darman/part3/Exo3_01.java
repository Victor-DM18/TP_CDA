package darman.part3;
import java.util.Scanner ;

public class Exo3_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nb;
		
		System.out.print("Ecrivez un nombre : ");
		Scanner sc = new Scanner(System.in);
		nb = sc.nextFloat();
		sc.close();
		
		if(nb>0) {
		System.out.println(nb+" est positif");
		}
		else 
		{System.out.println(nb+" est négatif");
		}
		
		

	}

}
