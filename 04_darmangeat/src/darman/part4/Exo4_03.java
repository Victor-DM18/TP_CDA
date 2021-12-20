package darman.part4;

import java.util.Scanner;

public class Exo4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours, minutes, seconds;

		Scanner sc = new Scanner(System.in);

		System.out.print("Quelle heure est-il (heure) ? ");
		hours = sc.nextInt();

		System.out.print("Quelle heure est-il (minutes) ? ");
		minutes = sc.nextInt();

		System.out.print("Quelle heure est-il (secondes) ? ");
		seconds = sc.nextInt();

		sc.close();

		System.out.println("Il est : " + hours + "h" + minutes + "m" + seconds + "s");

		System.out.println("Dans une seconde, il sera : "
				+ (int)(hours + (Math.floor(((minutes + Math.floor((seconds + 1) / 60))) / 60))) % 24 + "h"
				+ (int)(minutes + Math.floor((seconds + 1) / 60)) % 60 + "m" + (seconds + 1) % 60 + "s");
	}

}
