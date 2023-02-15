package problems.p0000_0100.p0048_rotate_image;

import static problems.ArraysUtil.assertIntArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void rotate1() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] exp = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        };
        new Solution().rotate(matrix);
        assertIntArrayEquals(exp, matrix);
    }

    @Test
    void rotate2() {
        int[][] matrix = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}};
        int[][] exp = {
            {15, 13, 2, 5},
            {14, 3, 4, 1},
            {12, 6, 8, 9},
            {16, 7, 10, 11}
        };
        new Solution().rotate(matrix);
        assertIntArrayEquals(exp, matrix);
    }

}