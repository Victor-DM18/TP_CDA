package darman.part4;
import java.util.Scanner ;

public class Exo4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour, minute ;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quelle heure est-il (heure) ?");
		hour = sc.nextInt();
		
		System.out.print("Quelle heure est-il (minute) ?");
		minute = sc.nextInt();
		
		sc.close();
		
		System.out.println("Il est : "+hour+"h"+minute);
		
		System.out.println("Dans une minute, il sera : "+(hour+(Math.floor((minute+1)/60)))%24+"h"+(minute+1)%60);
		

	}

}
