package leetcode75;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MostCandiesTest {

    public static final MostCandies MOST_CANDIES = new MostCandies();

    @Test
    void kidsWithCandies() {
        List<Boolean> booleans = MOST_CANDIES.kidsWithCandies(new int[]{2, 3, 4, 5, 6, 2}, 2);
        List<Boolean> expectedBooleans = new ArrayList<>(booleans.size());
        expectedBooleans.add(false);
        expectedBooleans.add(false);
        expectedBooleans.add(false);
        expectedBooleans.add(true);
        expectedBooleans.add(true);
        expectedBooleans.add(false);
        assertEquals(expectedBooleans, booleans);
    }
}