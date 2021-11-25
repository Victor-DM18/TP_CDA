package darman.part6;

public class Exo6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab1 = {4, 8, 7, 9, 1, 5, 4, 6};
		int[] tab2 = {7, 6, 5, 2, 1, 3, 7, 4};
		int[] som = new int[8];
		
		for(int i = 0; i < som.length; i++) {
			som[i] = tab1[i] + tab2[i];
			System.out.println(som[i]);
		}
		
	}



}
