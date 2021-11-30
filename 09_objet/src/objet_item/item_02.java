package objet_item;
import java.nio.charset.Charset;
import java.util.Scanner;


public class item_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "L'élève";

		for (char c : chaine.toCharArray()) {
			System.out.printf("\\u%04x ", (int) c);
		}
		
		Scanner sc = new Scanner(System.in);
		
		byte[] bytesArray = new byte[10];
		byte[] bytes;
		String chaine2 = new String(bytes, Charset.utf-8) ;
		
		System.out.print("Entrez une chaine de caractère : ");
		chaine2 = sc.nextLine();
		
		System.out.println(chaine2);
		
		sc.close();
	}

}
