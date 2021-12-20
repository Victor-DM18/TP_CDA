package darman.part6;

public class Exo6_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Suite = new int[8];
		
		int i ;
		
		Suite[0] = 1;
		Suite[1] = 1;
		
		for(i =2; i < 8; i++) {
			Suite[i] = Suite[i - 1] + Suite[i - 2];
		}
		
		for(i = 0; i < 8; i++) {
			System.out.println(Suite[i]);
		}

	}

}
