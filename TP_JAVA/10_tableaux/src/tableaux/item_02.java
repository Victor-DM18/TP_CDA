package tableaux;
import java.util.Arrays;

public class item_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tab1 = {"do", "re", "mi", "fa", "sol", "la", "si", "do", "re", "mi"};
		String[] tab2 = new String[10];
		tab2 = tab1;

			
		System.out.println("COPIE DE REFERENCE");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab1));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab2));
		
		String[] cap = new String[10];
		for(int i = 0  ; i < 10; i++) {
		 cap[i]  = tab1[i].substring(0, 1).toUpperCase() + tab1[i].substring(1);
		}
		
		tab2 = tab1;

		System.out.println("Apres changement");
		System.out.println("Tableaux 1 => " + Arrays.toString(cap));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab2));
		
		String[] tab3 = {"do", "re", "mi", "fa", "sol", "la", "si", "do", "re", "mi"};
		String[] tab4 = tab3.clone();
		
		System.out.println("COPIE AVEC LA METHODE clone() : ");
		System.out.println("Tableaux 3 => " + Arrays.toString(tab3));
		System.out.println("Tableaux 4 => " + Arrays.toString(tab4));
		
		
		String[] cap1 = new String[10];
		for(int i = 0  ; i < 10; i++) {
		 cap1[i]  = tab3[i].substring(0, 1).toUpperCase() + tab3[i].substring(1);
		}
		System.out.println("Apres changement");
		System.out.println("Tableaux 1 => " + Arrays.toString(cap1));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab4));
		
		String[] tab5 = {"do", "re", "mi", "fa", "sol", "la", "si", "do", "re", "mi"};
		String[] tab6 = new String[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			tab6[i] = tab5[i];
		}
		System.out.println("COPIE CASE PAR CASE");
		System.out.println("Tableaux 1 => " + Arrays.toString(tab5));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab6));
		
		
		String[] cap2 = new String[10];
		for(int i = 0  ; i < 10; i++) {
		 cap2[i]  = tab5[i].substring(0, 1).toUpperCase() + tab5[i].substring(1);
		}
		System.out.println("Apres changement");
		System.out.println("Tableaux 1 => " + Arrays.toString(cap2));
		System.out.println("Tableaux 2 => " + Arrays.toString(tab6));
		
	}

}
