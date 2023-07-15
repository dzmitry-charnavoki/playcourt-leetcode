package problems.p1800_1900.p1899_merge_triplets_to_form_target_triplet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import problems.p1800_1900.p1899_merge_triplets_to_form_target_triplet.Solution;

class SolutionTest {

    @Test
    void mergeTriplets1() {
        assertTrue(new Solution().mergeTriplets(new int[][] {
            {2, 5, 3}, {1, 8, 4}, {1, 7, 5}
        }, new int[] {2, 7, 5}));
    }

    @Test
    void mergeTriplets2() {
        assertFalse(new Solution().mergeTriplets(new int[][] {
            {3, 4, 5}, {4, 5, 6}
        }, new int[] {3, 2, 5}));
    }

    @Test
    void mergeTriplets3() {
        assertTrue(new Solution().mergeTriplets(new int[][] {
            {2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}
        }, new int[] {5, 5, 5}));
    }

}
