package problems.p0000_0100.p0040_combination_sum_ii;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void combinationSum1() {
        List<List<Integer>> ac = new Solution().combinationSum2(new int[] {10,1,2,7,6,1,5}, 8);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{1,1,6}, {1,2,5}, {1,7}, {2,6}});
        assertListEquals(ex, ac);

    }
    @Test
    void combinationSum2() {
        List<List<Integer>> ac = new Solution().combinationSum2(new int[] {2,5,2,1,2}, 5);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{1, 2, 2}, {5}});
        assertListEquals(ex, ac);

    }


}