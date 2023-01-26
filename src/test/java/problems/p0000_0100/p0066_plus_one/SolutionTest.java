package problems.p0000_0100.p0066_plus_one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void plusOne1() {
        assertArrayEquals(new int[] {1, 2, 4}, new Solution().plusOne(new int[] {1, 2, 3}));
    }

    @Test
    void plusOne2() {
        assertArrayEquals(new int[] {4, 3, 2, 2}, new Solution().plusOne(new int[] {4, 3, 2, 1}));
    }

    @Test
    void plusOne3() {
        assertArrayEquals(new int[] {1, 0}, new Solution().plusOne(new int[] {9}));
    }

    @Test
    void plusOne4() {
        assertArrayEquals(new int[] {3, 0, 0}, new Solution().plusOne(new int[] {2, 9, 9}));
    }

}