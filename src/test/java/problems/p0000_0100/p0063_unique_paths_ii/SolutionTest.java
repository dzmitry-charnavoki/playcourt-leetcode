package problems.p0000_0100.p0063_unique_paths_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void uniquePathsWithObstacles1() {
        int[][] in = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        assertEquals(2, new Solution().uniquePathsWithObstacles(in));
    }

    @Test
    void uniquePathsWithObstacles2() {
        int[][] in = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        assertEquals(2, new Solution().uniquePathsWithObstacles(in));
    }
    @Test
    void uniquePathsWithObstacles3() {
        int[][] in = new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(4, new Solution().uniquePathsWithObstacles(in));
    }

}