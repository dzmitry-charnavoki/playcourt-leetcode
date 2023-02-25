package problems.p0000_0100.p0056_merge_intervals;

import static problems.ArraysUtil.assertIntArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void merge1() {
        int[][] inervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18},
        };
        int[][] exp = {
            {1, 6},
            {8, 10},
            {15, 18}
        };
        assertIntArrayEquals(exp, new Solution().merge(inervals));
    }

    @Test
    void merge2() {
        int[][] inervals = {
            {1, 4},
            {4, 5}
        };
        int[][] exp = {
            {1, 5}
        };
        assertIntArrayEquals(exp, new Solution().merge(inervals));
    }
}