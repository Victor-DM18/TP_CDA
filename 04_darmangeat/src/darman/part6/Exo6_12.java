package darman.part6;
import java.util.Scanner;

public class Exo6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur du tableau : ");
		length = sc.nextInt();
		
		int[] tab = new int[length];
		int[] tbFinal = new int[length];
		
		
		for ( int i = 0; i < tab.length; i++) {
			System.out.print("Entrez une valeur pour l'index " + i + " : ");
			tab[i] = sc.nextInt();
		}
		
		sc.close();
		
			for ( int i = 0; i < tab.length; i++) {
			tbFinal[i] = 1 + tab[i];
			}
			
		for ( int t : tbFinal) {
		System.out.println(t);
		}
	}

}
