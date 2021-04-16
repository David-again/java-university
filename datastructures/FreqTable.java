package datastructures;

import java.util.HashMap;
import java.util.Map;

public class FreqTable {

	public static void main(String[] args) {
		// Problem statement: Given an array of numbers, create a frequency table using a HashMap

		Map<Integer, Integer> numTable;		// Output variable
		
		// Test input.
		int[] numArray = {2,2,2,2,5,6,6,7,6,7};
		// int[] numArray2 = {1,3,4,4,2,6};

		numTable = freqTable(numArray);
		System.out.println(numTable);
		System.out.println(numTable.size());
	}

	public static Map<Integer, Integer> freqTable(int[] numbers) {
		Map<Integer, Integer> numbersTable = new HashMap<Integer, Integer>();
		for (int num : numbers) {
			int currFreq = 0;
			if (numbersTable.containsKey(num)) {
				currFreq = numbersTable.get(num);
			}
			numbersTable.put(num, (currFreq+1));
		}
		// Output the frequency table.
		return numbersTable;
	}
}
