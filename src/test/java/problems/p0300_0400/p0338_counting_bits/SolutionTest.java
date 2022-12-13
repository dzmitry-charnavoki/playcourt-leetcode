package problems.p0300_0400.p0338_counting_bits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void countBits11() {
        assertArrayEquals(new int[]{0,1,1}, new Solution().countBits(2));
    }

    @Test
    void countBits12() {
        assertArrayEquals(new int[]{0,1,1,2,1,2}, new Solution().countBits(5));
    }

    @Test
    void countBits13() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2}, new Solution().countBits(17));
    }

    @Test
    void countBits14() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3}, new Solution().countBits(37));
    }

}