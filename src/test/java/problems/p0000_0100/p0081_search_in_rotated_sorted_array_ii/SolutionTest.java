package problems.p0000_0100.p0081_search_in_rotated_sorted_array_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void search1() {
        assertTrue(new Solution().search(new int[] {2, 5, 6, 0, 0, 1, 2}, 0));
    }

    @Test
    void search2() {
        assertFalse(new Solution().search(new int[] {2, 5, 6, 0, 0, 1, 2}, 3));
    }

    @Test
    void search3() {
        assertTrue(new Solution().search(new int[] {1, 0, 1, 1, 1}, 0));
    }

    @Test
    void search11() {
        assertTrue( new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void search12() {
        assertFalse(new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void search13() {
        assertFalse(new Solution().search(new int[] {1}, 0));
    }

    @Test
    void search4() {
        assertTrue(
            new Solution().search(new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1, 2}, 11));
    }

    @Test
    void search5() {
        assertTrue(
            new Solution().search(new int[] {12, 13, 0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11}, 11));
    }

    @Test
    void search6() {
        assertTrue(
            new Solution().search(new int[] {12, 13, 0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11}, 1));
    }

    @Test
    void search7() {
        assertTrue(
            new Solution().search(new int[] {7, 8, 9, 10, 11, 12, 0, 1, 2, 3, 4, 5, 6}, 12));
    }

}