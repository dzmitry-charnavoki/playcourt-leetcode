package problems.p0000_0100.p0034_find_first_and_last_position_of_element_in_sorted_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void searchRange1() {
        assertArrayEquals(new int[] {3, 4},
            new Solution().searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8));
    }

    @Test
    void searchRange2() {
        assertArrayEquals(new int[] {-1, -1},
            new Solution().searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6));
    }

    @Test
    void searchRange3() {
        assertArrayEquals(new int[] {-1, -1},
            new Solution().searchRange(new int[] {}, 0));
    }

//    @Test
//    void searchRange4() {
//        assertArrayEquals(new int[] {3, 4},
//            new Solution().searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8));
//    }
}