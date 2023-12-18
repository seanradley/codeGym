package org.example.OddRepeater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddRepeaterTest {

    @Test
    void findOddRepeater() {
        int[] numbers = {1, 2, 7, 6, 1, 1, 2, 2, 2, 7, 6};
        OddRepeater oddRepeater = new OddRepeater();
        int oddRepeatingInt = oddRepeater.findOddRepeater(numbers);
        assertEquals(1, oddRepeatingInt);
    }
    @Test
    void findOddRepeaterXOR() {
        int[] numbers = {1, 2, 7, 6, 1, 1, 2, 2, 2, 7, 6};
        OddRepeater oddRepeater = new OddRepeater();
        int oddRepeatingInt = oddRepeater.findOddRepeaterXOR(numbers);
        assertEquals(1, oddRepeatingInt);
    }
}