package org.example.TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    public static final TwoSum TWO_SUM = new TwoSumMap();

    @Test
    void threeNumbers() {
        int[] nums = {1,2,3};
        int[] actual = TWO_SUM.twoSum(nums, 3);
        assertEquals(0, actual[0]);
        assertEquals(1, actual[1]);

        actual = TWO_SUM.twoSum(nums, 4);
        assertEquals(0, actual[0]);
        assertEquals(2, actual[1]);

        actual = TWO_SUM.twoSum(nums, 5);
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
    }

    @Test
    void fourNumbers() {
        int[] nums = {2,3,4,5};
        int[] actual = TWO_SUM.twoSum(nums, 7);
        assertEquals(0, actual[0]);
        assertEquals(3, actual[1]);

        actual = TWO_SUM.twoSum(nums, 9);
        assertEquals(2, actual[0]);
        assertEquals(3, actual[1]);

        actual = TWO_SUM.twoSum(nums, 6);
        assertEquals(0, actual[0]);
        assertEquals(2, actual[1]);
    }
}