package problems.p1800_1900.p1851_minimum_interval_to_include_each_query;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minInterval1() {
        int[][] act = new int[][] {{1, 4}, {2, 4}, {3, 6}, {4, 4}};
        assertArrayEquals(new int[] {3, 3, 1, 4},
            new Solution().minInterval(act, new int[] {2, 3, 4, 5}));
    }

    @Test
    void minInterval2() {
        int[][] act = new int[][] {{2, 3}, {2, 5}, {1, 8}, {20, 25}};
        assertArrayEquals(new int[] {2, -1, 4, 6},
            new Solution().minInterval(act, new int[] {2, 19, 5, 22}));
    }

}