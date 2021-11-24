package darman.part5;
import java.util.Scanner;


public class Exo5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price, change = 0, totalPrice = 0, priceSpend, i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Entrez le prix de l'article " + i++ + " :");
			price = sc.nextInt();
			totalPrice += price; 
		}while( price != 0);
	
	
	System.out.print("Entrez la somme donnée : ");
	priceSpend = sc.nextInt();
	
	if(priceSpend >= totalPrice) {
		change = priceSpend - totalPrice ;
	}else {
		System.out.println("montant trop faible !");
	}
	
	while(change > 0) {
		if(change >= 10) {
			System.out.println("10 euros rendus !");
			change -= 10;
		}
		if( change >= 5) {
			System.out.println("5 euros rendus !");
			change -= 5;
		}
		if( change >= 1) {
			System.out.println("1 euro rendu !");
			change -= 1;
			
		}
		
		sc.close();
	}
	}
}
