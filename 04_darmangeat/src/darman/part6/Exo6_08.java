package darman.part6;
import java.util.Scanner;

public class Exo6_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur à saisir dans le tableau : ");
		length = sc.nextInt();
		
		int pos = 0;
		int neg = 0;
		int  l = length;
		int[] tab = new int[l];
		
		
		
		for(int i = 0; i < tab.length; i++) {
			System.out.print("Entrez la valeur de l'index " + i + " du tableau : ");
			tab[i] = sc.nextInt();
			
			if(tab[i] > 0) {
				pos = pos + 1;
			}else {
				neg = neg + 1;
			}
			
		}
		
		if ( sc != null) {
		sc.close();
		}
		
		for(int t : tab) {
		System.out.println(t);
		}
		
		System.out.println("Le nombre de valeur positif est de : " + pos);
		System.out.println("Le nombre de valeur negatif est de : " + neg);
		
	}

}
