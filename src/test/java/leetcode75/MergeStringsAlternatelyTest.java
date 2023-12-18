package leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    public static final MergeStringsAlternately MERGE_STRINGS_ALTERNATELY = new MergeStringsAlternately();

    @Test
    void mergeAlternately() {
        String merged = MERGE_STRINGS_ALTERNATELY.mergeAlternately("abc", "pqr");
        assertEquals("apbqcr", merged);
    }

    @Test
    void mergeAlternatelyOneLonger() {
        String merged = MERGE_STRINGS_ALTERNATELY.mergeAlternately("qwerqwer", "asdf");
        assertEquals("qawsedrfqwer", merged);
    }

    @Test
    void mergeAlternatelyTwoLonger() {
        String merged = MERGE_STRINGS_ALTERNATELY.mergeAlternately("qwer", "asdfasdf");
        assertEquals("qawsedrfasdf", merged);
    }
}