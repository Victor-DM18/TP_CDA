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
					System.out.println("Il y a deux solutions :");
					double x1 = (-b-Math.sqrt(delta))/(2.*a);
					double x2 = (-b+Math.sqrt(delta))/(2.*a);
					System.out.printf("x1 = %f\n",x1);
					System.out.printf("x2 = %f\n",x2);
				}
		
	}

}
