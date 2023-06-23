package problems.p0200_0300.p0207_course_schedule;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canFinish1() {
        assertTrue(new Solution().canFinish(2, new int[][] {{1, 0}}));
    }

    @Test
    void canFinish2() {
        assertFalse(new Solution().canFinish(2, new int[][] {{1, 0}, {0, 1}}));
    }

}