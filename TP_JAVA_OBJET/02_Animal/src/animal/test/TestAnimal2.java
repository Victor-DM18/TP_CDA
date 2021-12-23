package animal.test;

import java.util.Arrays;

import animal2.metier.Animal2;
import animal2.metier.Chien2;
import animal2.metier.Homme2;

public class TestAnimal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal2[] animaux = new Animal2[3];
		
		animaux[0] = new Animal2 ("Truc");
		animaux[1] = new Chien2 ("Medor");
		animaux[2] = new Homme2 ("Robert");
		
		Arrays.asList(animaux).stream().forEach(System.out::println);
		System.out.println(animaux[1].compareTo(new Chien2("Robert")));

	}

}
