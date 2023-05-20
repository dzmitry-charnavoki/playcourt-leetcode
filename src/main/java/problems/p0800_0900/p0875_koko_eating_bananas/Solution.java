package problems.p0800_0900.p0875_koko_eating_bananas;

import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l < r) {
            int hours = 0;
            int k = (l + r) / 2;
            hours = eatHours(piles, k);
            if (hours <= h) {
                res = Math.min(res, k);
                r = k;

            } else {
                l = k + 1;
            }

        }

        return l;
    }

    private int eatHours(int[] piles, int m) {
        return Arrays.stream(piles).reduce(
            0, (subtotal, pile) -> subtotal + (pile - 1) / m + 1); // Math.ceil(pile / m)
    }
}
