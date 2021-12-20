package version;

public class version_01 {
	
	static final int nbDiv = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nAffichage des MULTIPLE de " + nbDiv + " entre 0 et 100\n ");
		
		for ( int x = 0; x <= 100; x++ ) {
			if( x % nbDiv == 0) {
				System.out.print("(" + x + ")\t");
			}else {
				System.out.print(" " + x + " \t");
			}
		}
	}

}
