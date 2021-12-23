package animal.test;

import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;

import animal.metier.Animal;
import animal.metier.Chien;
import animal.metier.Homme;
import animal.metier.Mammifere;

public class TestAnimal {
	

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Animal> animaux = new TreeSet<Animal>();
		
		 animaux.add(new Animal ("Truc"));
		 animaux.add(new Chien ("Medor"));
		 animaux.add(new Homme ("Robert"));
		
			/*
			 * System.out.
			 * println("--------Transfomer le tableau en liste et faire parler tout le monde------"
			 * ); Arrays.asList(animaux).stream().forEach(System.out::println);
			 * System.out.println();
			 */
		 
		 
		 //CompareTo//
			/*
			 * Animal a = new Mammifere("unMammifère"); Comparable<?> c = new Homme("Jean");
			 * Serializable s = new Chien("Medor"); Homme h1 = (Homme) c;
			 */
		
		
		System.out.println("--------Trier avec un treeSet------");
		(animaux).stream().forEach(System.out::println);
		System.out.println();
		
		
		// using descendingSet()
		
		System.out.println("=== parle() via TreeSet.stream :");
		TreeSet<Animal> ts = new TreeSet<Animal>();
		ts.addAll(animaux);
		ts.forEach(x->x.parle());
		/*
		 * ------------INSTANCEOF-------------
		 * 
		 * System.out.println("--------instanceof------"); System.out.println(animaux[3]
		 * instanceof nommable ); System.out.println();
		 */		
		

			    
	}

}
