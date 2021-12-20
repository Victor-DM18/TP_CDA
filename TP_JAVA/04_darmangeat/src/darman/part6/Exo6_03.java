package darman.part6;
import java.util.Scanner;

public class Exo6_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab ;
		tab = new int[9];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tab.length; i++) {
			
	
		System.out.print("Entrez une valeur " + i + " : ");
		tab[i] = sc.nextInt();
		sc.nextLine();
		
		}
		
		sc.close();

		
		for (int n : tab) {
		System.out.println(n);
		}
	}

}
