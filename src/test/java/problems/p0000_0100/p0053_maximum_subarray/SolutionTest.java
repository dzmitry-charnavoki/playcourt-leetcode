package problems.p0000_0100.p0053_maximum_subarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxSubArray11() {
        assertEquals(6, new Solution().maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void maxSubArray12() {
        assertEquals(1, new Solution().maxSubArray(new int[] {1}));
    }

    @Test
    void maxSubArray13() {
        assertEquals(23, new Solution().maxSubArray(new int[] {5, 4, -1, 7, 8}));
    }
}