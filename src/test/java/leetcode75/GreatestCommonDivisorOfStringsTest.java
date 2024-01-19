package leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    public static final GreatestCommonDivisorOfStrings GREATEST_COMMON_DIVISOR_OF_STRINGS = new GreatestCommonDivisorOfStrings();

    @Test
    void gcdOfStrings() {
        String gcdOfStrings = GREATEST_COMMON_DIVISOR_OF_STRINGS.gcdOfStrings("ABCABC", "ABC");
        assertEquals("ABC", gcdOfStrings);

        gcdOfStrings = GREATEST_COMMON_DIVISOR_OF_STRINGS.gcdOfStrings("ABABAB", "ABABABABAB");
        assertEquals("AB", gcdOfStrings);

        gcdOfStrings = GREATEST_COMMON_DIVISOR_OF_STRINGS.gcdOfStrings("FOO", "BAR");
        assertEquals("", gcdOfStrings);

        String s = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        gcdOfStrings = GREATEST_COMMON_DIVISOR_OF_STRINGS.gcdOfStrings(s, s);
        assertEquals(s, gcdOfStrings);
    }
}