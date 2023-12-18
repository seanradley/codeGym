package org.example.TwoSum;
/*
https://leetcode.com/problems/two-sum/solutions/4122827/beats-99-03-detailed-explanation-with-solution-using-o-n-approach/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[0];
    }
}
