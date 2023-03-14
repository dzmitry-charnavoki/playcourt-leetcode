package problems.p0000_0100.p0075_sort_colors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void sortColors1() {
        int[] act = new int[] {2, 0, 2, 1, 1, 0};
        new Solution().sortColors(act);
        assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, act);
    }

    @Test
    void sortColors2() {
        int[] act = new int[] {2, 0, 1};
        new Solution().sortColors(act);
        assertArrayEquals(new int[] {0, 1, 2}, act);
    }

    @Test
    void sortColors3() {
        int[] act = new int[] {1, 2, 0};
        new Solution().sortColors(act);
        assertArrayEquals(new int[] {0, 1, 2}, act);
    }

    @Test
    void sortColors4() {
        int[] act = new int[] {1, 2, 2, 2, 2, 0, 0, 0, 1, 1};
        new Solution().sortColors(act);
        assertArrayEquals(new int[] {0, 0, 0, 1, 1, 1, 2, 2, 2, 2}, act);
    }

    @Test
    void sortColors5() {
        int[] act = new int[] {0, 1, 2};
        new Solution().sortColors(act);
        assertArrayEquals(new int[] {0, 1, 2}, act);
    }
}