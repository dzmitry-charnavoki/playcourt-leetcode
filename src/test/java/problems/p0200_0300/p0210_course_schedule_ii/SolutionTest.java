package problems.p0200_0300.p0210_course_schedule_ii;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findOrder1() {
        assertArrayEquals(new int[] {0, 1}, new Solution()
            .findOrder(2, new int[][] {{1, 0}}));
    }

    @Test
    void findOrder2() {
        assertArrayEquals(new int[] {0, 2, 1, 3}, new Solution()
            .findOrder(4, new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }

    @Test
    void findOrder3() {
        assertArrayEquals(new int[] {0}, new Solution()
            .findOrder(1, new int[][] {}));
    }

    @Test
    void findOrder4() {
        assertArrayEquals(new int[] {1,0}, new Solution()
            .findOrder(2, new int[][] {{0,1}}));
    }

    @Test
    void findOrder5() {
        assertArrayEquals(new int[] {}, new Solution()
            .findOrder(4, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 0}}));
    }
}