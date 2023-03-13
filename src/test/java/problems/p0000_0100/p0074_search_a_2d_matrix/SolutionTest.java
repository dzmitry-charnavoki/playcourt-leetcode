package problems.p0000_0100.p0074_search_a_2d_matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void searchMatrix1() {
        assertTrue(new Solution().searchMatrix(new int[][] {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        }, 3));
    }

    @Test
    void searchMatrix2() {
        assertFalse(new Solution().searchMatrix(new int[][] {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        }, 13));
    }

    @Test
    void searchMatrix3() {
        assertFalse(new Solution().searchMatrix(new int[][] {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        }, 65));
    }
    @Test
    void searchMatrix4() {
        assertFalse(new Solution().searchMatrix(new int[][] {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        }, 21));
    }

    @Test
    void searchMatrix5() {
        assertFalse(new Solution().searchMatrix(new int[][] {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        }, 0));
    }


}