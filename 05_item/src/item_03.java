import java.util.Scanner;
public class item_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		a = sc.nextFloat();
		
		System.out.print("b = ");
		b = sc.nextFloat();
		
		System.out.print("c = ");
		c = sc.nextFloat();
		
		sc.close();
		
		int delta = (int) ((b*b) + 4*a*c);
		
		System.out.println((int) ((b*b) + 4*a*c));
		
		if (delta < 0 ) {
			System.out.println("Il n'y à pas de solution");
		}else
			if(delta == 0) {
				System.out.println("Il y à qu'une solution : x = -b / (2a)");
			}else
				if(delta > 0) {
					
				}
				
		
		
		
	}

}
