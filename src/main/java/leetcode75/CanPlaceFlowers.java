package leetcode75;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0)
                return true;

            if (flowerbed[i] == 0
            && (i == 0 || flowerbed[i-1] == 0)
            && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                n--;
                flowerbed[i] = 1;
            }
        }

        return n == 0;
    }
}
