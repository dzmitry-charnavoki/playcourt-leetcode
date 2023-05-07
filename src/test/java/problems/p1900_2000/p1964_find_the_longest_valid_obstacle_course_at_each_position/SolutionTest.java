package problems.p1900_2000.p1964_find_the_longest_valid_obstacle_course_at_each_position;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestObstacleCourseAtEachPosition1() {
        assertArrayEquals(new int[] {1, 2, 3, 3}, new Solution()
            .longestObstacleCourseAtEachPosition(new int[] {1, 2, 3, 2}));
    }

    @Test
    void longestObstacleCourseAtEachPosition2() {
        assertArrayEquals(new int[] {1, 2, 1}, new Solution()
            .longestObstacleCourseAtEachPosition(new int[] {2, 2, 1}));
    }

    @Test
    void longestObstacleCourseAtEachPosition3() {
        assertArrayEquals(new int[] {1, 1, 2, 3, 2, 2}, new Solution()
            .longestObstacleCourseAtEachPosition(new int[] {3, 1, 5, 6, 4, 2}));
    }

}