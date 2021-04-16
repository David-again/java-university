package datastructures;

import java.util.HashMap;
// import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		// Implement map interfaces
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		mapUtil(hMap);
		
	}
	public static void mapUtil(Map<Integer, String> map) {
		// 1. Add Key-value pairs
		map.put(101,  "Steve");
		map.put(12,  "Andrew");
		map.put(350,  "Agnes");
		map.put(220,  "Julius");
		map.put(49,  "Saleem");
		map.put(12,  "Roger");	// will it replace Steve's data?  (i.e. are duplicates allowed?) 
		
		// 2. Expose / access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		System.out.println("For key " + 220 + ", value is: " + map.get(220));
		
		// 3. Iterate through map of key-value pairs
		for(int key: map.keySet()) {
			System.out.println("[KEY: " + key + ".  VALUE: " + map.get(key) + ".]");
		}
	}
}
