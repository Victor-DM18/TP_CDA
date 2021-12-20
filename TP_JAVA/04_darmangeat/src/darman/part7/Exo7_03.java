package darman.part7;

public class Exo7_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab = {1, 2, 3, 4};
		
		for( int i = 0; i < tab.length / 2; i++ ) {
			int v = tab[i];
			tab[i] = tab[tab.length - 1 - i];
			tab[tab.length - 1 -i] = v;
		}
		
		for(int t : tab) {
		System.out.println(t);
		}
	}

}
