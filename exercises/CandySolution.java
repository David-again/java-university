package exercises;

import java.util.HashMap;
import java.util.Map;

public class CandySolution {

    public int solution(int[] T) {
        
        // Algorithm
        // Determine length of T (i.e. numOfCandies = T.length )
        // int halfOfCandies = numOfCandies / 2
        // Create frequency table for T[] (i.e. freqTable[element, freq] ) 
        // Create 1-D array containing frequencies only (i.e. freqsArray = ExtractFreqFrom(freqTable) )
        // if (halfOfCandies <= freq.length) then
        //      return halfOfCandies
        //  else
        //      return freq.length
        // endif

        if (null == T || T.length % 2 != 0) {
            throw new IllegalArgumentException("Please provide a valid array");
        }
        int numberOfCandy = T.length;
        int giveAway = numberOfCandy / 2;
        Map<Integer, Integer> candyCount = new HashMap <>();

        for (int i = 0; i < numberOfCandy; i++) {
            int candy = T[i];
            int count = 0;
            if (candyCount.containsKey(candy)) {
                count += 1;
            }
            candyCount.put(candy, count);
        }
        System.out.println(candyCount);
        return Math.min(candyCount.size(), giveAway);
    }
    public static void main(String[] args) {
        // Problem description: 
        //      Given an array containing an even number of integers (with some repetition); Suppose each integer represents a flavor of candy.
        //      Suppose you must share evenly with your favorite friend.
        //      This program determines the max number of different flavors you can eat, after parting with half of the lot.

        // int[] candies = {2,2,2,2,5,6,6,7,6,7};
        int[] candies = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
        // int[] candies = {3,4,7,7,6,6};

        // Create object to access the 'non-static' (public) method solution().
        CandySolution myObj = new CandySolution();

        int maxFlavors = myObj.solution(candies);
        System.out.println("The maximum number of flavors you can eat is: " + maxFlavors + "\n");
        // The max flavors you can eat will be the lower of totalFlavors and half of the entire lot.

    }
}
