package leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    public static final CanPlaceFlowers CAN_PLACE_FLOWERS = new CanPlaceFlowers();

    @Test
    void canPlaceFlowers() {
        assertTrue(CAN_PLACE_FLOWERS.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertFalse(CAN_PLACE_FLOWERS.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertTrue(CAN_PLACE_FLOWERS.canPlaceFlowers(new int[]{0,0,0,0,1}, 2));
        assertTrue(CAN_PLACE_FLOWERS.canPlaceFlowers(new int[]{0,0,1,0,0}, 2));
        assertTrue(CAN_PLACE_FLOWERS.canPlaceFlowers(new int[]{0,0,1,0,0,0,0,0}, 3));
        assertFalse(CAN_PLACE_FLOWERS.canPlaceFlowers(new int[]{0,0,1,0,0,0,0,0}, 4));
    }
}