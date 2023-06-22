package problems.p0900_1000.p0994_rotting_oranges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void orangesRotting1() {
        int[][] act = new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, new Solution().orangesRotting(act));
    }

    @Test
    void orangesRotting2() {
        int[][] act = new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(-1, new Solution().orangesRotting(act));
    }

    @Test
    void orangesRotting3() {
        int[][] act = new int[][] {{0, 2}};
        assertEquals(0, new Solution().orangesRotting(act));
    }
}