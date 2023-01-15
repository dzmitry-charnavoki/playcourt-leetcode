package problems.p0000_0100.p0031_next_permutation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void nextPermutation_n1() {
        int[] res = new int[] {13};
        new Solution().nextPermutation(null);
        new Solution().nextPermutation(res);
        assertArrayEquals(new int[] {13}, res);
    }

    @Test
    void nextPermutation1() {
        int[] res = new int[] {1, 2, 3};
        new Solution().nextPermutation(res);
        assertArrayEquals(new int[] {1, 3, 2}, res);
    }

    @Test
    void nextPermutation2() {
        int[] res = new int[] {3, 2, 1};
        new Solution().nextPermutation(res);
        assertArrayEquals(new int[] {1, 2, 3}, res);
    }

    @Test
    void nextPermutation3() {
        int[] res = new int[] {1, 1, 5};
        new Solution().nextPermutation(res);
        assertArrayEquals(new int[] {1, 5, 1}, res);
    }

    @Test
    void nextPermutation4() {
        int[] res = new int[] {1, 4, 6, 2};
        new Solution().nextPermutation(res);
        assertArrayEquals(new int[] {1, 6, 2, 4}, res);
    }

}