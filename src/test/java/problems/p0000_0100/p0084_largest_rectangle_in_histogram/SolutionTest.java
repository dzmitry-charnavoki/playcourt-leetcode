package problems.p0000_0100.p0084_largest_rectangle_in_histogram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void largestRectangleArea1() {
        assertEquals(10, new Solution().largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
    }

    @Test
    void largestRectangleArea2() {
        assertEquals(4, new Solution().largestRectangleArea(new int[] {2, 4}));
    }

}