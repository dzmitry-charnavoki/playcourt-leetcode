package problems.p0300_0400.p0312_burst_balloons;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxCoins() {
        assertEquals(167, new Solution().maxCoins(new int[] {3, 1, 5, 8}));
    }

    @Test
    void maxCoins2() {
        assertEquals(10, new Solution().maxCoins(new int[] {1, 5}));
    }
}