package problems.p0300_0400.p0300_longest_increasing_subsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void lengthOfLIS() {
        assertEquals(4, new Solution().lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void lengthOfLIS2() {
        assertEquals(4, new Solution().lengthOfLIS(new int[] {0, 1, 0, 3, 2, 3}));
    }

    @Test
    public void lengthOfLIS3() {
        assertEquals(1, new Solution().lengthOfLIS(new int[] {7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    public void lengthOfLIS4() {
        assertEquals(1, new Solution().lengthOfLIS(new int[] {7}));
    }

}