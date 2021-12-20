package objet_item;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class item_02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String chaine = "L'élève";
		
		Scanner sc = new Scanner(System.in);


		for (char c : chaine.toCharArray()) {
			System.out.printf("\\u%04x ", (int) c);
		}
		
		
		String chaine2 = new String() ;
		
		
		System.out.println("Entrez une chaine de caractère : ");
		chaine2 = sc.nextLine();
		
		byte arr[] = chaine2.getBytes("UTF8");
		for( byte t : arr) {
		System.out.println("\\u%04x " + t);
		}
		sc.close();
	}

}
