package datastructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// 1. Define the collection
		Set<String> animals = new HashSet<String>();
		
		// 2. Adding elements
		animals.add("dog");
		animals.add("pig");
		animals.add("cat");
		animals.add("impala");
		animals.add("eagle");
		animals.add("pig");
		animals.add("hyena");
		System.out.println("animals:" + animals); // note that they're printed out in a random order.
		// Also note that it only displays unique (or distinct) elements (i.e. each element once).
		
		// 3. Create another set (with some common elements) for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("dog");
		farmAnimals.add("chicken");
		System.out.println("farmAnimals:" + farmAnimals + "\n");
		
		// 4. Find the INTERSECTION between animals and farmAnimals Sets
		// Hint: use the .retainAll property.
		// 4a. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		// 4b. Retain ONLY elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// 5. What is the UNION? Hint: use the .addAll method.
		// TODO
		
		// 6. What is the DIFFERENCE? Hint: use the .removeAll method.
		// TODO
		
		

	}

}
