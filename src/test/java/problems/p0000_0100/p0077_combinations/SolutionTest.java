package problems.p0000_0100.p0077_combinations;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void combine1() {
        List<List<Integer>> ac =
            new Solution().combine(4, 2);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {
                {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}
            });
        assertListEquals(ex, ac);
    }

    @Test
    void combine() {
        List<List<Integer>> ac =
            new Solution().combine(1, 1);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {
                {1}
            });
        assertListEquals(ex, ac);
    }
}