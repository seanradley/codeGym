package org.example.TwoSum;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/two-sum/solutions/4122827/beats-99-03-detailed-explanation-with-solution-using-o-n-approach/
 */
public class TwoSumMap extends TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            intIndex.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (intIndex.containsKey(diff))
                    return new int[]{i, intIndex.get(diff)};
        }
        return new int[0];
    }
}
