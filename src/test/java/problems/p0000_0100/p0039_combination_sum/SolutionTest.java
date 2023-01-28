package problems.p0000_0100.p0039_combination_sum;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

@Disabled
class SolutionTest {

    @Test
    void combinationSum() {
        List<List<Integer>> ac = new Solution().combinationSum(new int[] {2, 3, 6, 7}, 7);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{2, 2, 3}, {7}});
        assertListEquals(ex, ac);
    }
}