package leetcode75;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
 */
public class MostCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> mostCandies = new ArrayList<>(candies.length);

        int maxCandies = 0;
        for (int numberOfCandies : candies) {
            if (maxCandies < numberOfCandies)
                maxCandies = numberOfCandies;
        }

//        Slower streaming option
//        int maxCandies = Arrays.stream(candies).max().orElse(0);

        for (int numberOfCandies : candies) {
            mostCandies.add(numberOfCandies + extraCandies >= maxCandies);
        }

        return mostCandies;
    }
}
