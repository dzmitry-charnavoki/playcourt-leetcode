package problems.p0000_0100.p0018_4sum;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void fourSum1() {
        List<List<Integer>> ac = new Solution().fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{-2, -1, 1, 2}, {-2, 0, 0, 2}, {-1, 0, 0, 1}});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum2() {
        List<List<Integer>> ac = new Solution().fourSum(new int[] {2, 2, 2, 2, 2}, 8);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{2, 2, 2, 2}});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum3() {
        List<List<Integer>> ac = new Solution().fourSum(new int[] {1, 0, -1, 0, -2, 2}, 1);
        List<List<Integer>> ex = ListUtils.getLists(new int[][] {{-2, 0, 1, 2}, {-1, 0, 0, 2}});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum31() {
        List<List<Integer>> ac =
            new Solution().fourSum(new int[] {1000000000, 1000000000, 1000000000, 1000000000},
                -294967296);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum32() {
        List<List<Integer>> ac =
            new Solution().fourSum(new int[] {-1000000000, -1000000000, -1000000000, -1000000000},
                294967296);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum33() {
        List<List<Integer>> ac =
            new Solution().fourSum(
                new int[] {1, 2, 3, 4, 5, 1000000000, 1000000000, 1000000000, 1000000000},
                -294967296);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum34() {
        List<List<Integer>> ac =
            new Solution().fourSum(new int[] {0,0,0,-1000000000,-1000000000,-1000000000,-1000000000}, 294967296);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }
    @Test
    void fourSum35() {
        List<List<Integer>> ac =
            new Solution().fourSum(new int[] {1000000000,1000000000,1000000000,1000000000,-1000000000,-1000000000,-1000000000,-1000000000}, 0);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{-1000000000,-1000000000,1000000000,1000000000}});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum4() {
        List<List<Integer>> ac =
            new Solution().fourSum(new int[] {1, 0, -1, -2, 0, 4, 4, 5, 5}, 5);
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{-2, -1, 4, 4}, {-1, 0, 1, 5}, {0, 0, 1, 4}});
        assertListEquals(ex, ac);
    }

    @Test
    void fourSum_n1() {
        List<List<Integer>> ac =
            new Solution().fourSum(new int[] {}, 1);
        assertListEquals(List.of(), ac);
    }

    @Test
    void fourSum_n2() {
        List<List<Integer>> ac =
            new Solution().fourSum(null, 1);
        assertListEquals(List.of(), ac);
    }

}