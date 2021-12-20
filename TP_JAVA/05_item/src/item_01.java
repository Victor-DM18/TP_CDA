import java.util.Scanner;

public class item_01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int euro;
		String s ="" ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez une somme en euro : ");
		euro = sc.nextInt();
		
		sc.close();
		
		 int dollar =  (int) (euro * 1.1226) ;
		
		if (Integer.toString(dollar).length() > 6) {
			dollar = dollar / 1000000;
			s = "M";
		}else
			if( Integer.toString(dollar).length() > 3) {
				dollar = dollar / 1000;
				s = "K";
			}else {
				s = "";
			}
		
		System.out.println(euro + " est egal à : " + dollar + s + " $");
	}

}
