package objet_item;
<<<<<<< HEAD
import java.io.UnsupportedEncodingException;
=======
import java.nio.charset.Charset;
>>>>>>> da7d00e845f81743aafa9d965024abfc132d1bf9
import java.util.Scanner;


public class item_02 {

<<<<<<< HEAD
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String chaine = "L'élève";
		
		Scanner sc = new Scanner(System.in);

=======
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "L'élève";
>>>>>>> da7d00e845f81743aafa9d965024abfc132d1bf9

		for (char c : chaine.toCharArray()) {
			System.out.printf("\\u%04x ", (int) c);
		}
		
<<<<<<< HEAD
		
		String chaine2 = new String() ;
		
		
		System.out.println("Entrez une chaine de caractère : ");
		chaine2 = sc.nextLine();
		
		byte arr[] = chaine2.getBytes("UTF8");
		for( byte t : arr) {
		System.out.println("\\u%04x " + t);
		}
=======
		Scanner sc = new Scanner(System.in);
		
		byte[] bytesArray = new byte[10];
		byte[] bytes;
		String chaine2 = new String(bytes, Charset.utf-8) ;
		
		System.out.print("Entrez une chaine de caractère : ");
		chaine2 = sc.nextLine();
		
		System.out.println(chaine2);
		
>>>>>>> da7d00e845f81743aafa9d965024abfc132d1bf9
		sc.close();
	}

}
