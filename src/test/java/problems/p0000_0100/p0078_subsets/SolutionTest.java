package problems.p0000_0100.p0078_subsets;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void subsets1() {
        List<List<Integer>> ac =
            new Solution().subsets(new int[] {1, 2, 3});
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {
                {1, 2, 3}, {1, 2}, {1, 3}, {1}, {2, 3}, {2}, {3}, {}
            });
        assertListEquals(ex, ac);
    }

    @Test
    void subsets2() {
        List<List<Integer>> ac =
            new Solution().subsets(new int[] {0});
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {
                {0}, {}
            });
        assertListEquals(ex, ac);
    }

    @Test
    void subsets_bm1() {
        List<List<Integer>> ac =
            new Solution().subsets2(new int[] {1, 2, 3});
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {
                {}, {1}, {2}, {1, 2}, {3}, {1, 3}, {2, 3}, {1, 2, 3},
            });
        assertListEquals(ex, ac);
    }

}