package tableaux;
import java.util.Arrays;


public class item_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab1 = { 18, 11, 8, 10, 7, 17, 28, 27, 30, 21};
		int[] tab2 = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			tab2[i] = tab1[i];
		}
		System.out.println("COPIE CASE PAR CASE");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab1));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab2));
		
		for( int i = 0 ; i < 10 ; i++) {
			tab1[i] = tab1[i] + 10;
		}
		System.out.println("Apres ajout de 10 : ");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab1));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab2));
		
		
		int[] tab3 = { 18, 11, 8, 10, 7, 17, 28, 27, 30, 21};
		int[] tab4 = tab3.clone();
		
		System.out.println("COPIE AVEC LA METHODE clone() : ");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab3));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab4));
		
		for( int i = 0 ; i < 10 ; i++) {
			tab3[i] = tab3[i] + 10;
		}
		System.out.println("Apres ajout de 10 : ");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab3));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab4));
		
		
		int[] tab5 = { 18, 11, 8, 10, 7, 17, 28, 27, 30, 21};
		int[] tab6 = new int[10];
		tab6 = tab5;

		System.out.println("COPIE PAR REFERENCE");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab5));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab6));
		
		for( int i = 0 ; i < 10 ; i++) {
			tab5[i] = tab5[i] + 10;
		}
		System.out.println("Apres ajout de 10 : ");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab5));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab6));
		
	}


}
