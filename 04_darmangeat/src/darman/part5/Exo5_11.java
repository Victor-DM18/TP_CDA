package darman.part5;
import java.util.Scanner;

public class Exo5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start, play ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nombre de chevaux partants ? : ");
		start = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("nombre de chevaux joués ? : ");
		play = sc.nextInt();
		
		int x = factoriel(start)  / factoriel(start - play) ;
		int y = factoriel(start) / (factoriel(play) * factoriel(start - play));
		
	
	
	System.out.println("Dans l'ordre : une chance sur "+ x);
	System.out.println("Dans le désordre : une chance sur "+ y);
	
	sc.close();
	}

	private static int factoriel(int arg) {
		// TODO Auto-generated method stub
		int n = 1;
		int i = 1;
		while (i <= arg) {
			n *= i ++;
		}
		return n;
	}
}
