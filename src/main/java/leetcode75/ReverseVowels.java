package leetcode75;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] chars = s.toCharArray();
        while (j > i) {
            if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            } else {
                swapChars(chars, i, j);
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }

    private static void swapChars(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
