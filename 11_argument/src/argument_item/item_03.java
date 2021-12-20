package argument_item;

import java.util.Scanner;

public class item_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		verifieNoSS();

	}

	public static void verifieNoSS() {

		long ss = 2550675113052l;
		int nb = 99;

		Scanner sc = new Scanner(System.in);

		while (nb != 79) {
			System.out.print(ss + " clés : ");
			nb = sc.nextInt();

			if (nb == 79) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		
		sc.close();

	}

}
