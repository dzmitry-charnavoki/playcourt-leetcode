package problems.p0100_0200.p0153_find_minimum_in_rotated_sorted_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findMin1() {
        assertEquals(1, new Solution().findMin(new int[] {3, 4, 5, 1, 2}));
    }

    @Test
    void findMin2() {
        assertEquals(0, new Solution().findMin(new int[] {4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    void findMin3() {
        assertEquals(11, new Solution().findMin(new int[] {11, 13, 15, 17}));
    }

}