package problems.p0000_0100.p0088_merge_sorted_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void merge1() {
        int[] exp = new int[] {1, 2, 2, 3, 5, 6};
        int[] num1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] num2 = new int[] {2, 5, 6};
        new Solution().merge(num1, 3, num2, 3);
        assertArrayEquals(exp, num1);
    }

    @Test
    void merge2() {
        int[] exp = new int[] {1};
        int[] num1 = new int[] {1};
        int[] num2 = new int[] {};
        new Solution().merge(num1, 1, num2, 0);
        assertArrayEquals(exp, num1);
    }

    @Test
    void merge3() {
        int[] exp = new int[] {1, 2};
        int[] num1 = new int[] {2, 0};
        int[] num2 = new int[] {1};
        new Solution().merge(num1, 1, num2, 1);
        assertArrayEquals(exp, num1);
    }

    @Test
    void merge4() {
        int[] exp = new int[] {1};
        int[] num1 = new int[] {0};
        int[] num2 = new int[] {1};
        new Solution().merge(num1, 0, num2, 1);
        assertArrayEquals(exp, num1);
    }

}