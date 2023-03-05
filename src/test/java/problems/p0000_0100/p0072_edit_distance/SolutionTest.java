package problems.p0000_0100.p0072_edit_distance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minDistance1() {
        assertEquals(3, new Solution().minDistance("horse", "ros"));
    }

    @Test
    void minDistance2() {
        assertEquals(5, new Solution().minDistance("intention", "execution"));
    }

    @Test
    void minDistance_o1() {
        assertEquals(0, new Solution().minDistance("intention", "intention"));
    }
    @Test
    void minDistance_o2() {
        assertEquals(9, new Solution().minDistance("", "execution"));
    }
    @Test
    void minDistance_o3() {
        assertEquals(6, new Solution().minDistance("intent", ""));
    }

}