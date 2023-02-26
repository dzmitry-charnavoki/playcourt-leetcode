package problems.p0000_0100.p0057_insert_interval;

import static problems.ArraysUtil.assertIntArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void insert1() {

        int[][] inervals = {
            {1, 3},
            {6, 9}
        };
        int[] nInterval = new int[] {2, 5};
        int[][] exp = {
            {1, 5},
            {6, 9}
        };
        assertIntArrayEquals(exp,
            new Solution().insert(inervals, nInterval));

    }

    @Test
    void insert2() {

        int[][] inervals = {
            {1, 2},
            {3, 5},
            {6, 7},
            {8, 10},
            {12, 16}
        };
        int[] nInterval = new int[] {4, 8};
        int[][] exp = {
            {1, 2},
            {3, 10},
            {12, 16}
        };
        assertIntArrayEquals(exp,
            new Solution().insert(inervals, nInterval));

    }

    @Test
    void insert3() {
        int[][] inervals = {
            {1, 2},
            {6, 9}
        };
        int[] nInterval = new int[] {3, 5};
        int[][] exp = {
            {1, 2},
            {3, 5},
            {6, 9}
        };
        assertIntArrayEquals(exp,
            new Solution().insert(inervals, nInterval));

    }

    @Test
    void insert4() {
        int[][] inervals = {
            {1, 2},
            {6, 9}
        };
        int[] nInterval = new int[] {10, 11};
        int[][] exp = {
            {1, 2},
            {6, 9},
            {10, 11}
        };
        assertIntArrayEquals(exp,
            new Solution().insert(inervals, nInterval));

    }
}