package darman.part6;

public class Exo6_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] N;
		N = new int[7];
		int k ;
		
		N[0] = 1 ;
		
		System.out.println(N[0]);
		
		for(k = 1; k < 7; k++) {
			N[k] = N[k - 1] + 2;
		
			System.out.println(N[k]);
		}
		
	}

}
