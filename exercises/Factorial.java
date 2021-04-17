package exercises;

public class Factorial {

	public static void main(String[] args) {
		// Write a function that computes the factorial value.
		// Definition: n! = n*(n-1)! , where 0! = 1
		int n = 10;
		System.out.println("The factorial of "+ n + " is: "+ factorial(n));
	}
	
	public static int factorial(int inputNum) {
		if (inputNum <= 0) {
			return 1;
		} else {
			return inputNum * factorial(inputNum - 1);
		}
	}
}
