package darman.part6;

public class Exo6_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {18, 32, 10};
		float som = 0;
		
		for(int t : tab) {
		System.out.println(t);
		}
		
		for(int i = 0; i < tab.length; i++) {
			som = som + tab[i];
		}
		
		System.out.println("La somme des valeurs du tableau est de : " + som);

		
		}

}
