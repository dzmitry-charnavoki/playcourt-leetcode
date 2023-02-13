package problems.p0000_0100.p0047_permutations_ii;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void permuteUnique1() {
        List<List<Integer>> ac = new Solution().permuteUnique(new int[] {1, 1, 2});
        List<List<Integer>> ex = ListUtils
            .getLists(
                new int[][] {
                    {1, 1, 2},
                    {1, 2, 1},
                    {2, 1, 1}
                });
        assertListEquals(ex, ac);
    }

    @Test
    void permuteUnique2() {
        List<List<Integer>> ac = new Solution().permuteUnique(new int[] {1, 2, 3});
        List<List<Integer>> ex = ListUtils
            .getLists(
                new int[][] {
                    {1, 2, 3},
                    {1, 3, 2},
                    {2, 1, 3},
                    {2, 3, 1},
                    {3, 1, 2},
                    {3, 2, 1}
                });
        assertListEquals(ex, ac);
    }

    @Test
    void permuteUnique3() {
        List<List<Integer>> ac = new Solution().permuteUnique(new int[] {3, 3, 0, 3});
        List<List<Integer>> ex = ListUtils
            .getLists(
                new int[][] {
                    {0, 3, 3, 3},
                    {3, 0, 3, 3},
                    {3, 3, 0, 3},
                    {3, 3, 3, 0}
                });
        assertListEquals(ex, ac);
    }
}