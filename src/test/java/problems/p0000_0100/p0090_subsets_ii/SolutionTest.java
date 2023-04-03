package problems.p0000_0100.p0090_subsets_ii;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void subsetsWithDup1() {
        List<List<Integer>> ac = new Solution().subsetsWithDup(new int[] {1, 2, 2});
        List<List<Integer>> ex = ListUtils.getLists(new int[][] {
            {}, {1}, {1, 2}, {1, 2, 2}, {2}, {2, 2}
        });
        assertListEquals(ex, ac);
    }

    @Test
    void subsetsWithDup2() {
        List<List<Integer>> ac = new Solution().subsetsWithDup(new int[] {0});
        List<List<Integer>> ex = ListUtils.getLists(new int[][] {
            {}, {0}
        });
        assertListEquals(ex, ac);
    }

    @Test
    void subsetsWithDup3() {
        List<List<Integer>> ac = new Solution().subsetsWithDup(new int[] {1, 5, 2, 3, 2});
        List<List<Integer>> ex = ListUtils.getLists(new int[][] {
            {}, {1}, {1, 2}, {1, 2, 2}, {1, 2, 2, 3}, {1, 2, 2, 3, 5},
            {1, 2, 2, 5}, {1, 2, 3}, {1, 2, 3, 5}, {1, 2, 5}, {1, 3}, {1, 3, 5}, {1, 5},
            {2}, {2, 2}, {2, 2, 3}, {2, 2, 3, 5}, {2, 2, 5}, {2, 3}, {2, 3, 5}, {2, 5}, {3}, {3, 5},
            {5}
        });
        assertListEquals(ex, ac);
    }

}