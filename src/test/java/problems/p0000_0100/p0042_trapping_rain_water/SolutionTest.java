package problems.p0000_0100.p0042_trapping_rain_water;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void trap1_1() {
        assertEquals(6,
            new Solution().trapTwoPointers(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void trap1_2() {
        assertEquals(9, new Solution().trapTwoPointers(new int[] {4, 2, 0, 3, 2, 5}));
    }

    @Test
    void trap2_1() {
        assertEquals(6, new Solution().trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void trap2_2() {
        assertEquals(9, new Solution().trap(new int[] {4, 2, 0, 3, 2, 5}));
    }

}