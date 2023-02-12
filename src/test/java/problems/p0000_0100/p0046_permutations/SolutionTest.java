package problems.p0000_0100.p0046_permutations;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void permute1() {
        List<List<Integer>> ac = new Solution().permute(new int[] {1, 2, 3});
        List<List<Integer>> ex = ListUtils
            .getLists(
                new int[][] {
                    {1, 2, 3},
                    {1, 3, 2},
                    {2, 1, 3},
                    {2, 3, 1},
                    {3, 1, 2},
                    {3, 2, 1}});
        assertListEquals(ex, ac);
    }

    @Test
    void permute2() {
        List<List<Integer>> ac = new Solution().permute(new int[] {0, 1});
        List<List<Integer>> ex = ListUtils
            .getLists(
                new int[][] {
                    {0, 1},
                    {1, 0}
                });
        assertListEquals(ex, ac);
    }

    @Test
    void permute3() {
        List<List<Integer>> ac = new Solution().permute(new int[] {1});
        List<List<Integer>> ex = ListUtils
            .getLists(
                new int[][] {
                    {1}
                });
        assertListEquals(ex, ac);
    }
}