package exercises;

import java.util.Arrays;

public class ArrayOfNumbers {

	public static void main(String[] args) {
		// Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
		
		//	1(a). Define the input
		int[] A = {3, 2, 7, 13, 4, 12, 20, 1, 5, 1};
		
		// 1(b). Display the input 
		System.out.print("Given the following array: [");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
			if (i < A.length) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
		
		System.out.println("The minimum value is: " + getMin(A));
		System.out.println("The average value is: " + getAve(A));
		System.out.println("The maximum value is: " + getMax(A));
	}

	public static int getMin(int[] numArray) {
		// Return the lowest value in an integer array.
		Arrays.sort(numArray);
		return numArray[0];
	}
	
	public static int getAve(int[] numArray) {
		// Return the average value in an integer array.
		int sum = 0;
		for (int num : numArray) {
			sum += num;
		}
		int ave = sum / numArray.length;
		return ave;
	}
	
	public static int getMax(int[] numArray) {
		// Return the highest value in an integer array.
		Arrays.sort(numArray);
		return numArray[numArray.length-1];
	}
}
