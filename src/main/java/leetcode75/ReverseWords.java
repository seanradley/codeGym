package leetcode75;

import java.util.Arrays;
/*
https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class ReverseWords {

    // Tokenize words into array of strings, swap operation on array, recombine words using string builder
    public String reverseWords(String s) {
        String[] words = Arrays.stream(s.split("\\s+"))
                .filter(w -> !w.isEmpty())
                .toArray(String[]::new);

        int i = 0, j = words.length - 1;

        while (j > i) {
            swap(words, i++, j--);
        }

        return String.join(" ", words);
    }

    private static void swap(String[] words, int i, int j) {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }
}
