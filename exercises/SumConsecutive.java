package exercises;

public class SumConsecutive {

	public static void main(String[] args) {
		// Write a function that takes a value n returns the sum of numbers 1 to n
		int n = 20;
		System.out.println("The sum of integers from 1 to "+ n + " is: "+ sumFromOne(n));
	}
	
	public static int sumFromOne(int upperNum) {
		if (upperNum <= 1) {
			return 1;
		} else {
			return upperNum + sumFromOne(upperNum - 1);
		}
	}

}
