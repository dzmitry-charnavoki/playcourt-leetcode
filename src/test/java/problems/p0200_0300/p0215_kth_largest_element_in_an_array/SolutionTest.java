package problems.p0200_0300.p0215_kth_largest_element_in_an_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findKthLargest1() {
        assertEquals(5, new Solution()
            .findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void findKthLargest2() {
        assertEquals(4, new Solution()
            .findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    void findKthLargest2_1() {
        assertEquals(5, new Solution()
            .findKthLargestQS(new int[] {3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void findKthLargest2_2() {
        assertEquals(4, new Solution()
            .findKthLargestQS(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

}