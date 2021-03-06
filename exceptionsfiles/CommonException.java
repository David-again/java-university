package exceptionsfiles;

public class CommonException {

	public static void main(String[] args) {
		int a = 5, b = 0;
		
		// 1. Identify the potential problem area
		// 2. Surround with try-catch block.
		
		// Scenario 1
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("CANNOT DIVIDE BY ZERO");
			System.out.println(e.toString());
		}
		
		// Scenario 2
		String[] states = { "CA", "NY", "FL", "GA" };
		for (int i=0; i <= states.length; i++) {
			try {
				System.out.println(states[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR: Index " + i + " out of array range.");
				System.out.println(e.toString()); 		
					// It's good practice to also output the exception description as generated by the system.
			} finally {
				System.out.println("Iterating through the array."); 	
				// this block will ALWAYS execute, irrespective of whether an exception was found or not. 
			}
		}
	}

}
