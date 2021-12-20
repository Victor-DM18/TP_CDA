package argument_item;

import java.text.DecimalFormat;
import java.util.Scanner;

public class item_01 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String devise ;
		
		System.out.print("Quelle devise convertir en livre Sterling (euro/franc) ? : ");
		 devise = sc.nextLine();
		
		 switch (devise) {
		 case "euro" :
				EuroToSterling();
				break;
		 case "franc" :
			 FrancToSterling();
			 break;
		 }
		
			sc.close();

	}

	private static void FrancToSterling() {
		// TODO Auto-generated method stub
		
		final double RATIO_FRANC_STERLING = 0.13;
		
		 int franc;
		 double resultFranc;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Entrez une somme em franc : ");
		franc = sc.nextInt();
		
		resultFranc = RATIO_FRANC_STERLING * franc;
		
		System.out.println(franc + " francs = " + resultFranc + " livre sterling ");
		
		DecimalFormat dFranc = new DecimalFormat("#.#"); 

		
		System.out.print(dFranc.format(resultFranc));
		
		sc.close();

	}

	private static void EuroToSterling() {
		// TODO Auto-generated method stub
		
		final double RATIO_EURO_STERLING = 0.85;
		
		 int euro;
		 double resultEuro;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Entrez une somme em euro : ");
		euro = sc.nextInt();
		
		resultEuro = RATIO_EURO_STERLING * euro;
		
		System.out.println(euro + " euros = " + resultEuro + " livre sterling ");

		DecimalFormat dEuro = new DecimalFormat("#.#"); 

		System.out.print(dEuro.format(resultEuro));
		
		sc.close();

	}

	
}
