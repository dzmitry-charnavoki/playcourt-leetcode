package problems.p0000_0100.p0059_spiral_matrix_ii;

import static problems.ArraysUtil.assertIntArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void generateMatrix1() {
        int[][] exp = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };
        assertIntArrayEquals(exp,
            new Solution().generateMatrix(3));
    }

    @Test
    void generateMatrix2() {
        int[][] exp = {
            {1}
        };
        assertIntArrayEquals(exp,
            new Solution().generateMatrix(1));
    }
}