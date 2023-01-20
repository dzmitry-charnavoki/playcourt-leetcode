package problems.p0000_0100.p0035_search_insert_position;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void searchInsert1() {
        assertEquals(2, new Solution().searchInsert(new int[] {1, 3, 5, 6}, 5));
    }

    @Test
    void searchInsert2() {
        assertEquals(1, new Solution().searchInsert(new int[] {1, 3, 5, 6}, 2));
    }

    @Test
    void searchInsert3() {
        assertEquals(4, new Solution().searchInsert(new int[] {1, 3, 5, 6}, 7));
    }

    @Test
    void searchInsert4() {
        assertEquals(0, new Solution().searchInsert(new int[] {1,3,5,6}, 0));
    }

}