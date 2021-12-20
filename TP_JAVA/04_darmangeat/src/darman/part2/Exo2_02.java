package darman.part2;
import java.util.Scanner;


public class Exo2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb, nb2;
		
		System.out.print("Ecrivez un nombre : ");
		
		Scanner sc = new Scanner(System.in);
		nb = sc.nextInt();
		sc.close();
		
		nb2 = nb*nb;
		
		System.out.println("Le carré de "+nb+" est: "+nb2);
	}

}
