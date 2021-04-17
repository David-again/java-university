package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Jose", "Miami", "Dallas"};
		
		// Declare & define  
		String[] states = new String[5];
		states[0] = "Florida";
		states[1] = "Utah";
		states[2] = "Texas";
		states[3] = "Arizona";
		states[4] = "Illionis";
		
		System.out.println("List of States.");
		
		for (int i = 0; i < states.length; i++) {
			System.out.println((i+1) + ". " + states[i]);
		}
		
		System.out.println();
		System.out.println("List of Cities.");
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println((i+1) + ". " + cities[i]);
		}
	}

	
}
