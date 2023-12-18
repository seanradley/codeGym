package leetcode75;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder builder = new StringBuilder();
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        while (i < charArray1.length || i < charArray2.length) {
            if (i < charArray1.length)
                builder.append(charArray1[i]);
            if (i < charArray2.length)
                builder.append(charArray2[i]);
            i++;
        }

        return builder.toString();
    }
}
