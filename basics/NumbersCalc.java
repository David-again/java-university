package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		printName();
		addNumbers(4,3);
		double prod = multiplyNumbers(2,8);
		System.out.println("\nThe product of 2 and 8 is: " + prod);
	}
	
	static void printName() {
		System.out.println("My name is Bond.  James BOND!");
	}
	
	static void addNumbers(int num1, int num2) {
		// Function to add two numbers
		System.out.println("The sum of numbers " + num1 + " and " + num2 + " is: " + (num1 + num2));
	}
	
	static double multiplyNumbers(int numA, int numB) {
		double product = numA * numB;
		return product;	
	}

}
