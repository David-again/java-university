package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers.
		// fib(0) = 0; fib(1) = 1;
		// fib(2) = fib(1) + fib(0);
		// fib(3) = fib(2) + fib(1);
		
		for (int x = 0; x <= 10; x++) {
			System.out.println("The fibonnaci of " + x + " is: " + fib(x));
		}
	}
	
	public static int fib(int n) {
		if (n==0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return ( fib(n-1) + fib(n-2) );
		}
	}

}
