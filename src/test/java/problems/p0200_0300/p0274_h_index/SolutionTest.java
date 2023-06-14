package problems.p0200_0300.p0274_h_index;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void hIndex1() {
        assertEquals(3, new Solution().hIndex(new int[] {3, 0, 6, 1, 5}));
    }

    @Test
    void hIndex2() {
        assertEquals(1, new Solution().hIndex(new int[] {1, 3, 1}));
    }

    @Test
    void hIndex3() {
        assertEquals(4, new Solution().hIndex(new int[] {6, 6, 6, 6}));
    }

}