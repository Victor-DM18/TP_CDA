import java.util.Scanner;
public class test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la longeur du taableau : ");
		length = sc.nextInt();
		
		int[] tab = new int[length];
		
		for(int i = 0; i < tab.length; i++) {
			System.out.print("entrez la valeur de l'index " + i + " : " );
			tab[i] = sc.nextInt();
		}
		
		sc.close();
		
		for( int t : tab) {
			System.out.println(t);
		}
		
		int i = 1;
		
		while(tab[i] == tab[i - 1] + 1 && i < (length - 1)) {
			i = i + 1;
		}
		
		if(tab[i] == tab[i - 1] + 1) {
			System.out.println("Les valeurs sont consécutif");
		}else {
			System.out.println("Les valeurs ne sont pas consécutif");

		}
		
	}

}
