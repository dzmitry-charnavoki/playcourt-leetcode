package problems.p0000_0100.p0033_search_in_rotated_sorted_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void search1() {
        assertEquals(4, new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void search2() {
        assertEquals(-1, new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void search3() {
        assertEquals(-1, new Solution().search(new int[] {1}, 0));
    }

    @Test
    void search4() {
        assertEquals(7,
            new Solution().search(new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1, 2}, 11));
    }

    @Test
    void search5() {
        assertEquals(12,
            new Solution().search(new int[] {12, 13, 0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11}, 11));
    }

    @Test
    void search6() {
        assertEquals(3,
            new Solution().search(new int[] {12, 13, 0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11}, 1));
    }

    @Test
    void search7() {
        assertEquals(5,
            new Solution().search(new int[] {7, 8, 9, 10, 11, 12, 0, 1, 2, 3, 4, 5, 6}, 12));
    }
}