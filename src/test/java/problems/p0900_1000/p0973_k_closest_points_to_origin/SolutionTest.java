package problems.p0900_1000.p0973_k_closest_points_to_origin;

import static problems.ArraysUtil.assertIntArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void kClosest1() {
        int[][] exp = new int[][] {{-2, 2}};
        int[][] act = new int[][] {{1, 3}, {-2, 2}};
        assertIntArrayEquals(exp, new Solution().kthClosest(act, 1));
    }

    @Test
    void kClosest2() {
        int[][] exp = new int[][] {{3, 3}, {-2, 4}};
        int[][] act = new int[][] {{3, 3}, {5, -1}, {-2, 4}};
        assertIntArrayEquals(exp, new Solution().kthClosest(act, 2));
    }

}