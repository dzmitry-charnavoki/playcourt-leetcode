package problems.p0000_0100.p0015_3sum;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void threeSum1() {
        List<List<Integer>> ac = new Solution().threeSum(new int[] {-1, 0, 1, 2, -1, -4});
        List<List<Integer>> ex = ListUtils.getLists(new int[][] {{-1, -1, 2}, {-1, 0, 1}});
        assertListEquals(ex, ac);
    }

    @Test
    void threeSum11() {
        List<List<Integer>> ac =
            new Solution().threeSum(new int[] {-1, 0, 0, 1, 1, 2, 2, -1, -4, -4});
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{-4, 2, 2}, {-1, -1, 2}, {-1, 0, 1}});
        assertListEquals(ex, ac);
    }

    @Test
    void threeSum2() {
        List<List<Integer>> ac = new Solution().threeSum(new int[] {});
        List<List<Integer>> ex = ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }

    @Test
    void threeSum3() {
        List<List<Integer>> ac = new Solution().threeSum(new int[] {0});
        List<List<Integer>> ex = ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }
}