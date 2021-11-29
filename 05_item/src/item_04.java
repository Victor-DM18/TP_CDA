
public class item_04 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 2;
		int max = 100;
		
		String result = "";
		long debut = System.nanoTime();
		for(int i = min;i < max;i++) {
			boolean divisible = false;
			for(int j = min;j<i;j++) {
				if(i%j==0) {
					divisible = true;
				}
			}
			if(!divisible) {
				result += i + " ";
			}
		}
		long fin = System.nanoTime();
		
		System.out.println(result);
		System.out.printf("\nTrouvé en %.1fms.", (float)(fin-debut)/1000000);
		
		
	}

}
