import java.util.Scanner;
public class item_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val1, val2;
		char[] operator = {'+', '-', '*', '/'}; 
		
		Scanner sc = new Scanner(System.in);
		

		
		System.out.print("Entrez une valeur 1 : ");
		val1 = sc.nextInt();
		
		System.out.print("Entrez un operateur( +, -, *, /) : ");
		operator[0] = sc.next().charAt(0);
	
		System.out.print("Entrez une valeur 2 : ");
		val2 = sc.nextInt();
		
		sc.close();
		
		
		switch (operator[0]) {
		case '+':
			System.out.println(val1 + val2);
			break;
		case '-':
			System.out.println(val1 - val2);
			break;
		case '*':
			System.out.println(val1 * val2);
			break;
		case '/':
			System.out.println(val1 / val2);
			break;
		}
				 

	}

}
