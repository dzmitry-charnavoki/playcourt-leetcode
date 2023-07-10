package problems.p0300_0400.p0329_longest_increasing_path_in_a_matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestIncreasingPath1() {
        int[][] act = new int[][] {
            {9, 9, 4},
            {6, 6, 8},
            {2, 1, 1}
        };
        assertEquals(4, new Solution().longestIncreasingPath(act));
    }

    @Test
    void longestIncreasingPath2() {
        int[][] act = new int[][] {
            {3, 4, 5},
            {3, 2, 6},
            {2, 2, 1}
        };
        assertEquals(4, new Solution().longestIncreasingPath(act));
    }
    @Test
    void longestIncreasingPath3() {
        int[][] act = new int[][] {{1}};
        assertEquals(1, new Solution().longestIncreasingPath(act));
    }

}