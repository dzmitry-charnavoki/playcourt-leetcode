package problems.p0300_0400.p0322_coin_change;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void coinChange1() {
        assertEquals(3, new Solution().coinChange(new int[] {1, 2, 5}, 11));
    }

    @Test
    void coinChange2() {
        assertEquals(-1, new Solution().coinChange(new int[] {2}, 3));
    }

    @Test
    void coinChange3() {
        assertEquals(0, new Solution().coinChange(new int[] {1}, 0));
    }

}