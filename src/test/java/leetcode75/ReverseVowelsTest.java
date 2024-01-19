package leetcode75;

import leetcode75.arraystring.ReverseVowels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseVowelsTest {

    @Test
    void reverseVowels() {
        ReverseVowels reverseVowels = new ReverseVowels();
        assertEquals("leotcede", reverseVowels.reverseVowels("leetcode"));
        assertEquals("holle", reverseVowels.reverseVowels("hello"));
        assertEquals("Aa", reverseVowels.reverseVowels("aA"));
    }
}