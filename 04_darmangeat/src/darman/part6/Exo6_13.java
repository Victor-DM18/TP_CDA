package darman.part6;
import java.util.Scanner;

public class Exo6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur du tableau  : ");
		length = sc.nextInt();
		
		int[] tab = new int[length];
		
		for (int i = 0 ; i < length; i++) {
			System.out.print("Entrez une valeur pour l'index " + i + " : ");
			tab[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max = 0;
		
		for (int i = 0; i < length; i++) {
			if(tab[i] > tab[max]) {
				max = i;
			}
		}
			
			System.out.println("La plus grande valeur est : " + tab[max]);
			System.out.println("Sa position est à l'index " + max);

	}

}
