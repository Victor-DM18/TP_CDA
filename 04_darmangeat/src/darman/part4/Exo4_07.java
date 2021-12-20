package darman.part4;
import java.util.Scanner;

public class Exo4_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages, permis, accidents, assurance ;
		String contract ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quelle age avez vous ?");
		ages = sc.nextInt();
		
		System.out.print("Combien d'années de permis ?");
		permis = sc.nextInt();
		
		System.out.print("Nombre d'accident ?");
		accidents = sc.nextInt();
		
		System.out.print("Nombre d'année dans l'assrance ?");
		assurance = sc.nextInt();
		
		if (ages < 25 && permis < 2 && accidents == 0 && assurance < 5) {
			contract = "rouge";
			System.out.println("votre type de contrat est " + contract);
		}
		else
			if ( ages < 25 && permis < 2 && accidents == 0 && assurance >= 5) {
				contract = "orange";
				System.out.println("votre tye de contrat etait rouge mais devient ; " + contract);
			}
			else
				if ( (ages < 25 && permis >= 2) || (ages >= 25 && permis < 2 && accidents == 0 && assurance < 5))  {
					contract = "orange";
					System.out.println("votre type de contrat est : " + contract);
				}
				else
					if ( (ages < 25 && permis >= 2) || (ages >= 25 && permis < 2 && accidents == 0 && assurance >= 5)) {
						contract = "vert";
						System.out.println("votre type de contrat etait orange mais devient : " + contract);
					}
					else
						if( (ages < 25 && permis >= 2) || (ages >= 25 && permis < 2 && accidents == 1 && assurance < 5)) {
							contract = "rouge";
							System.out.println("votre type de contrat est : " + contract);
						}
						else
							if ( (ages < 25 && permis >= 2) || (ages >= 25 && permis < 2 && accidents == 1 && assurance >= 5)) {
								contract = "orange";
								System.out.println("votre type de contrat etait rouge mais devient : " + contract);
							}
							else
								if ( ages >= 25 && permis >= 2 && accidents == 0 && assurance < 5) {
									contract = "vert";
									System.out.println("votre contrat est de type : " + contract);
								}
								else
									if ( ages >= 25 && permis >= 2 && accidents == 0 && assurance >= 5) {
										contract = "bleue";
										System.out.println("votre contrat etait de type vert et devient : " + contract);
									}
									else
										if ( ages >= 25 && permis >= 2 && accidents == 1 && assurance < 5) {
											contract = "orange";
											System.out.println("votre contrat est de type ; " + contract);
										}
										else
											if ( ages >= 25 && permis >= 2 && accidents == 1 && assurance >= 5) {
												contract = "vert";
												System.out.println("votre contrat etait de type orange et devient ; " + contract);
											}
											else
												if ( ages >= 25 && permis >= 2 && accidents == 2 && assurance < 5) {
													contract = "rouge";
													System.out.println("votre contrat est de type : " + contract);
												}
												else
													if ( ages >= 25 && permis >= 2 && accidents == 2 && assurance >= 5) {
														contract = "orange";
														System.out.println("votre contrat etait de type rouge et devient : " + contract);
													}
													else {
														System.out.println("vous n'etes pas élligible à l'assurance !");
													}
		sc.close();
	}

}
