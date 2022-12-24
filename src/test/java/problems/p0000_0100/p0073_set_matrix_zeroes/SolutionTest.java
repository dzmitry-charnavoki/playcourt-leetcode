package problems.p0000_0100.p0073_set_matrix_zeroes;

import static problems.ArraysUtil.assertIntArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void setZeroes1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] exp = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        new Solution().setZeroes(matrix);
        assertIntArrayEquals(exp, matrix);
    }

    @Test
    void setZeroes11() {
        int[][] matrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 0}};
        int[][] exp = {{1, 1, 0}, {1, 1, 0}, {0, 0, 0}};
        new Solution().setZeroes(matrix);
        assertIntArrayEquals(exp, matrix);
    }

    @Test
    void setZeroes2() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] exp = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        new Solution().setZeroes(matrix);
        assertIntArrayEquals(exp, matrix);
    }

    @Test
    void setZeroes3() {
        int[][] matrix = {{1, 1, 0, 1}, {3, 4, 5, 2}};
        int[][] exp = {{0, 0, 0, 0}, {3, 4, 0, 2}};
        new Solution().setZeroes(matrix);
        assertIntArrayEquals(exp, matrix);
    }

    @Test
    void setZeroes4() {
        int[][] matrix = {{1, 2, 3, 4}, {3, 4, 0, 2}};
        int[][] exp = {{1, 2, 0, 4}, {0, 0, 0, 0}};
        new Solution().setZeroes(matrix);
        assertIntArrayEquals(exp, matrix);
    }

    @Test
    void setZeroes5() {
        int[][] matrix = {{1, 0, 3}};
        int[][] exp = {{0, 0, 0}};
        new Solution().setZeroes(matrix);
        assertIntArrayEquals(exp, matrix);
    }

    @Test
    void setZeroes6() {
        int[][] matrix = {{1, 2, 3, 4}, {3, 4, 1, 2}};
        int[][] exp = {{1, 2, 3, 4}, {3, 4, 1, 2}};
        new Solution().setZeroes(matrix);
        assertIntArrayEquals(exp, matrix);
    }


}