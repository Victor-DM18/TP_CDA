package darman.part4;

import java.util.Scanner ;

public class Exo4_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cand1, cand2, cand3, cand4 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("score du candidat numero 1 : ");
		cand1 = sc.nextInt();
		
		
		System.out.println("score du candidat numero 2 : ");
		cand2 = sc.nextInt();
		
		
		System.out.println("score du candidat numero 3 : ");
		cand3 = sc.nextInt();
		
		
		System.out.println("score du candidat numero 4 : ");
		cand4 = sc.nextInt();
		
		
		if (cand1 > 50) {
			System.out.println("Elu au premier tour !");	
		}
		else
			if (cand1 >= 12.5 && cand1 >= cand2 && cand1 >= cand3 && cand1 >= cand4) {
				System.out.println("Balotage favorable !");
			}
			else
				if (cand1 >= 12.5 && ( cand1 <= cand2 || cand1 <= cand3 || cand1 <= cand4)) {
					System.out.println("Ballotage defavorable");
				}
				else
					if (cand2 > 50 || cand3 > 50 || cand4 > 50 || cand1 < 12.5) {
						System.out.println("vous etes eliminé !");
					}
		
		
		sc.close();
	}

}
