package problems.p0100_0200.p0198_house_robber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void rob1() {
        assertEquals(4, new Solution().rob(new int[] {1, 2, 3, 1}));
    }

    @Test
    void rob2() {
        assertEquals(12, new Solution().rob(new int[] {2, 7, 9, 3, 1}));
    }
}