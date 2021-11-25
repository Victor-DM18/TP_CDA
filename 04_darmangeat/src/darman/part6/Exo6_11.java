package darman.part6;

public class Exo6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab1 = {4, 8, 7, 12};
		int[] tab2 = {3, 6};
		int multi = 0;
		
		for(int a = 0; a < tab1.length; a++ ) {
			for(int b = 0; b < tab2.length; b++) {
				multi = multi + tab1[a] * tab2[b];
			}
		}
		
		System.out.println(multi);
	}

}
