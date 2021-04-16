package exercises;

import java.util.HashMap;
import java.util.Map;

import datastructures.FreqTable;

public class CandyShare {

    public static void main(String[] args) {
        // Problem description: 
        //      Given an array containing an even number of integers (with some repetition); Suppose each integer represents a flavor of candy.
        //      Suppose you must share evenly with your favorite friend.
        //      This program determines the max number of different flavors you can eat, after parting with half of the lot.

        // int[] candies = {2,2,2,2,5,6,6,7,6,7};
        int[] candies = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
        // int[] candies = {3,4,7,7,6,6};
        
        // Create a frequency table for the candies.
        Map<Integer, Integer> candiesTable = new HashMap<Integer, Integer>();
        candiesTable = FreqTable.freqTable(candies);

        // Determine number of flavors of candy.
        int totalFlavors = candiesTable.size();

        int maxFlavors = Math.min(totalFlavors, (candies.length / 2));
        System.out.println("The maximum number of flavors you can eat is: " + maxFlavors + "\n");
        // The max flavors you can eat will be the lower of totalFlavors and half of the entire lot.

    }
}
