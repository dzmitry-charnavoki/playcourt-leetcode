package problems.p0200_0300.p0240_search_a_2d_matrix_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void searchMatrix1() {
        int[][] act = new int[][] {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        assertTrue(new Solution().searchMatrix(act, 5));
    }

    @Test
    void searchMatrix2() {
        int[][] act = new int[][] {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        assertFalse(new Solution().searchMatrix(act, 20));
    }

    @Test
    void searchMatrix3() {
        int[][] act = new int[][] {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        assertFalse(new Solution().searchMatrix(act, 0));
    }

}