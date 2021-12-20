package darman.part4;
import java.util.Scanner ;

public class Exo4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tutu, toto, tutu1, tutu2 ;
		String tata="ok" ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("tutu =  ");
		tutu = sc.nextInt();
		
		System.out.print("toto =  ");
		toto = sc.nextInt();
		

		sc.close();
		
		if (tutu > toto + 4 || tata == "ok") {
			tutu1 = tutu + 1;
			System.out.println("tutu vaut tutu + 1 donc tutu est egal à "+ tutu1 );
		}
		else
		{
			tutu2 = tutu - 1 ;
		System.out.println("tutuu vaut tutu - 1 donc tutu est egal à : "+ tutu2);
		}

	}

}
