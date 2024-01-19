package leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    @Test
    void reverseVowels() {
        ReverseVowels reverseVowels = new ReverseVowels();
        assertEquals("leotcede", reverseVowels.reverseVowels("leetcode"));
        assertEquals("holle", reverseVowels.reverseVowels("hello"));
        assertEquals("Aa", reverseVowels.reverseVowels("aA"));
    }
}