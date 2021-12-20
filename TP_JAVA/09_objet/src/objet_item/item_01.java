package objet_item;
import java.util.Scanner;

public class item_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = new String[2];
		
		Scanner sc = new Scanner(System.in);
		
		do {
		for(int i = 0 ; i < 2 ; i++) {
		System.out.print("Entrez une chaine de caracteres : ");
		s[i] = sc.nextLine();
		}
		
		if(s[0].equals(s[1])) 
			System.out.println("IDENTIQUE !!");
		
		}while(!(s[0].equals("fin") || s[1].equals("fin")));

		sc.close();
	}
}
