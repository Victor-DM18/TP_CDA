package darman.part7;

public class Exo7_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab = {18, 2, 14, 11};
			
		for(int i = 0; i < tab.length; i++) {
			int max = tab[i];
			int maxj = i;
			
			for(int j = i; j < tab.length; j ++) {
				if(tab[j] > max) {
					max = tab[j];
					maxj = j;
				}
			}
			
			if(i != maxj) {
				int v = tab[i];
				tab[i] = tab[maxj];
				tab[maxj] = v;
			
			
			for( int t : tab) {
			System.out.println(t);
			}
			}
			
		}
		
		boolean permute = true;
		
		while(permute) {
			permute = false;
			
			for(int i = 0;i<tab.length-1;i++) {
				
				if(tab[i] < tab[i+1]) {
					int temp = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = temp;
					permute = true;
				}
			}
		}
		
	}
}
