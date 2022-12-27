package problems.p0000_0100.p0004_median_of_two_sorted_arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findMedianSortedArrays_n1() {
        assertEquals(1,
            new Solution().findMedianSortedArrays(new int[] {}, new int[] {1}),
            1e-5);
    }
    @Test
    void findMedianSortedArrays1() {
        assertEquals(2.0,
            new Solution().findMedianSortedArrays(new int[] {1, 3}, new int[] {2}),
            1e-5);
    }

    @Test
    void findMedianSortedArrays2() {
        assertEquals(2.5,
            new Solution().findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}),
            1e-5);
    }

    @Test
    void findMedianSortedArrays3() {
        assertEquals(16.0,
            new Solution().findMedianSortedArrays(new int[] {1, 12, 15, 26, 38},
                new int[] {2, 13, 17, 30, 45}),
            1e-5);
    }

    @Test
    void findMedianSortedArrays4() {
        assertEquals(6.0,
            new Solution().findMedianSortedArrays(new int[] {2, 4, 6, 9},
                new int[] {1, 3, 7, 8, 10}),
            1e-5);
    }

}