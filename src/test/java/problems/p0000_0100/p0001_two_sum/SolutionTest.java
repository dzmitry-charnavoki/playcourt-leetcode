package problems.p0000_0100.p0001_two_sum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void twoSum1() {
        assertArrayEquals(new int[] {0, 1}, new Solution().twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    void twoSum2() {
        assertArrayEquals(new int[] {1, 2}, new Solution().twoSum(new int[] {3, 2, 4}, 6));
    }

    @Test
    void twoSum3() {
        assertArrayEquals(new int[] {0, 1}, new Solution().twoSum(new int[] {3, 3}, 6));
    }

    @Test
    void twoSumNegative() {
        assertArrayEquals(new int[] {}, new Solution().twoSum(new int[] {2, 7}, 11));
    }

}