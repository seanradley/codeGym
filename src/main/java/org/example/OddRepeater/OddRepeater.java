package org.example.OddRepeater;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OddRepeater {

    public int findOddRepeater(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i : numbers) {
            if (numberSet.contains(i))
                numberSet.remove(i);
            else
                numberSet.add(i);
        }
        return numberSet.iterator().next();
    }

    public int findOddRepeaterXOR(int[] numbers) {
        int xorValue = 0;
        for (int i : numbers) {
            xorValue = xorValue ^ i;
        }
        return xorValue;
    }
}