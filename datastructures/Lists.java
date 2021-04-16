package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. Create a collection
		ArrayList<String> cities = new ArrayList<>();
		
		// 2. Add some elements (no need to pre-specify it's length (before adding items.
		cities.add("Melbourne");
		cities.add("Toronto");
		cities.add("Abuja");
		cities.add("Mombassa");
		
		// 3. Iterate thru the collection.
		for (String city : cities) {
			System.out.println(city);
		}
		
		// 4. Get the size
		int size = cities.size();
		System.out.println(size + " is the number of items in the ArrayList enumerated above.");
		
		// 5. Retrieve a specific element (using it's index)
		System.out.println("\nThe 2nd item in the ArrayList is: " + cities.get(2));
		
		// 6. Remove an item or element
		// TODO (hint: use the .remove method)
		
	}

}
