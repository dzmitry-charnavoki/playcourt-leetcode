package problems.p0600_0700.p0695_max_area_of_island;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxAreaOfIsland1() {
        int[][] act = new int[][] {
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        assertEquals(6, new Solution()
            .maxAreaOfIsland(act));
    }

    @Test
    void maxAreaOfIsland2() {
        int[][] act = new int[][] {
            {0, 0, 0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, new Solution()
            .maxAreaOfIsland(act));
    }

    @Test
    void maxAreaOfIsland3() {
        int[][] act = new int[][] {
            {1, 0, 1, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 1, 0, 1, 0, 0, 1}
        };
        assertEquals(1, new Solution()
            .maxAreaOfIsland(act));
    }

}