package problems.p0000_0100.p0080_remove_duplicates_from_sorted_array_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void removeDuplicates1() {
        int[] act = new int[] {1, 1, 1, 2, 2, 3};
        assertEquals(5, new Solution().removeDuplicates(act));
        assertArrayEquals(new int[] {1, 1, 2, 2, 3, 3}, act);
    }

    @Test
    void removeDuplicates2() {
        int[] act = new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3};
        assertEquals(7, new Solution().removeDuplicates(act));
        assertArrayEquals(new int[] {0, 0, 1, 1, 2, 3, 3, 3, 3}, act);
    }

    @Test
    void removeDuplicates3() {
        int[] act = new int[] {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        assertEquals(7, new Solution().removeDuplicates(act));
        assertArrayEquals(new int[] {0, 0, 1, 1, 2, 3, 3, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3}, act);
    }

}