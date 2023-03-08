package problems.p0000_0100.p0064_minimum_path_sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minPathSum1() {
        int[][] in = new int[][] {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        assertEquals(7, new Solution().minPathSum(in));
    }
    @Test
    void minPathSum2() {
        int[][] in = new int[][] {
            {1, 2, 3},
            {4, 5, 6}
        };
        assertEquals(12, new Solution().minPathSum(in));
    }

}