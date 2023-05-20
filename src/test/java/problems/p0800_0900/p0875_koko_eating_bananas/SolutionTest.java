package problems.p0800_0900.p0875_koko_eating_bananas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minEatingSpeed1() {
        assertEquals(4, new Solution().minEatingSpeed(new int[] {3, 6, 7, 11}, 8));
    }

    @Test
    void minEatingSpeed2() {
        assertEquals(30, new Solution().minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5));
    }

    @Test
    void minEatingSpeed3() {
        assertEquals(23, new Solution().minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6));
    }
}