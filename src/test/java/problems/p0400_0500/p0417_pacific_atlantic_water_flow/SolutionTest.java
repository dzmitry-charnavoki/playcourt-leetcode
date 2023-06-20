package problems.p0400_0500.p0417_pacific_atlantic_water_flow;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void pacificAtlantic1() {
        int[][] in = new int[][] {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };
        List<List<Integer>> act = new Solution().pacificAtlantic(in);
        List<List<Integer>> ex =
            ListUtils.getLists(
                new int[][] {{0, 4}, {1, 3}, {1, 4}, {2, 2}, {3, 0}, {3, 1}, {4, 0}});
        assertListEquals(ex, act);
    }

    @Test
    void pacificAtlantic2() {
        int[][] in = new int[][] {
            {1}
        };
        List<List<Integer>> act = new Solution().pacificAtlantic(in);
        List<List<Integer>> ex =
            ListUtils.getLists(
                new int[][] {{0, 0}});
        assertListEquals(ex, act);
    }
}