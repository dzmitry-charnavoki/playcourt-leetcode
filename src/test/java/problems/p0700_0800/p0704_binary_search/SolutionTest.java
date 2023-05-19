package problems.p0700_0800.p0704_binary_search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void search1() {
        assertEquals(4, new Solution().search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void search2() {
        assertEquals(-1, new Solution().search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void search3() {
        assertEquals(1, new Solution().search(new int[] {2, 5}, 5));
    }

}