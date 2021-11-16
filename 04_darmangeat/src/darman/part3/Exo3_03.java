package darman.part3;
import java.util.Scanner ;
import java.util.Arrays ;

public class Exo3_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name;
		name = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ecrivez un nom : ");
		name[0] = sc.nextLine();
		for(int i = 1; i < name.length ; i++ ) {
			System.out.print("Ecrivez un nom : ");
			name[i] = sc.nextLine();
		}
		sc.close();
		
		String name2[] = name.clone();
		Arrays.sort(name2);
		
		System.out.printf("Les prénoms %s triés dans l'ordre alphabétique.",Arrays.equals(name, name2)?"sont":"ne sont pas");

	}

}
