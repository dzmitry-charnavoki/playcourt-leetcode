package problems.p0100_0200.p0167_two_sum_ii_input_array_is_sorted;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void twoSum1() {
        assertArrayEquals(new int[] {1, 2}, new Solution()
            .twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    void twoSum2() {
        assertArrayEquals(new int[] {1, 3}, new Solution()
            .twoSum(new int[] {2, 3, 4}, 6));
    }

    @Test
    void twoSum3() {
        assertArrayEquals(new int[] {1, 3}, new Solution()
            .twoSum(new int[] {2, 3, 4}, 6));
    }

    @Test
    void twoSum4() {
        assertArrayEquals(new int[] {1, 9}, new Solution()
            .twoSum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, 10));
    }

    @Test
    void twoSum5() {
        assertArrayEquals(new int[] {2, 3}, new Solution()
            .twoSum(new int[] { 5,25,75}, 100));
    }

    @Test
    void twoSum6() {
        assertArrayEquals(new int[] {}, new Solution()
            .twoSum(new int[] { 5,25,75}, 2));
    }

}
