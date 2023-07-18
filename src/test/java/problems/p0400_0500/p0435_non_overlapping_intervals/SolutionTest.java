package problems.p0400_0500.p0435_non_overlapping_intervals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void eraseOverlapIntervals1() {
        int[][] act = new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, new Solution().eraseOverlapIntervals(act));
    }

    @Test
    void eraseOverlapIntervals2() {
        int[][] act = new int[][] {{1, 2}, {1, 2}, {1, 2}};
        assertEquals(2, new Solution().eraseOverlapIntervals(act));
    }

    @Test
    void eraseOverlapIntervals3() {
        int[][] act = new int[][] {{1, 2}, {2, 3}};
        assertEquals(0, new Solution().eraseOverlapIntervals(act));
    }

    @Test
    void eraseOverlapIntervals4() {
        int[][] act = new int[][] {{1, 2}};
        assertEquals(0, new Solution().eraseOverlapIntervals(act));
    }

}