package tableau_item;
import java.util.Arrays;
import java.util.Scanner;

public class item_03 {
	
	private static double[] note;
	private static double moyNote;
	private static int valIgnore;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		note = new double[10];
		
		saisirNote();
		moyNote = moyenne();
		triNote();
		afficheResult();
	}


	private static void afficheResult() {
		// TODO Auto-generated method stub
		
		System.out.println("la note moyenne est de : " + moyNote);
		System.out.println("Première case : " + note[valIgnore]);
		System.out.println("dérnière note : " + note[note.length - 1]);
		System.out.println("dérnière note : " + note[note.length / 2]);
	}



	private static void triNote() {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		while(flag) {
			flag = false;
			for(int i = 0; i < note.length - 1; i++) {
				if(note[i] > note[i + 1]) {
					double tmp = note[i];
					note[i] = note[i + 1];
					note[i + 1] = tmp;
					flag = true;
				}
			}
		}
	}



	private static void saisirNote() {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i < note.length; i ++) {
		System.out.print("Entrez une note : ");
		note[i] = Double.parseDouble(sc.nextLine());
		}
				
		System.out.println(Arrays.toString(note));

		sc.close();
		
	}
	
	private static double moyenne() {
		// TODO Auto-generated method stub
		
		double som = 0;
		valIgnore = 0;
		
		for(int i = 0; i < note.length; i++) {
			if(note[i] == 0) {
				valIgnore ++;
			}else {
			 som += note[i];
			}
		}
		
		return som /(note.length - valIgnore);
		

	}
}
