package problems.p0200_0300.p0213_house_robber_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void rob1() {
        assertEquals(3, new Solution().rob(new int[] {2, 3, 2}));
    }

    @Test
    void rob2() {
        assertEquals(4, new Solution().rob(new int[] {1, 2, 3, 1}));
    }

    @Test
    void rob3() {
        assertEquals(5, new Solution().rob(new int[] {5}));
    }
}