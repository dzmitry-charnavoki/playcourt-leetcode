package problems.p0100_0200.p0102_binary_tree_level_order_traversal;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import letcode.TreeNode;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void levelOrder1() {
        List<List<Integer>> ac = new Solution()
            .levelOrder(TreeNode
                .of(3, 9, 20, null, null, 15, 7));
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{3}, {9, 20}, {15, 7}});

        assertListEquals(ex, ac);
    }

    @Test
    void levelOrder2() {
        List<List<Integer>> ac = new Solution()
            .levelOrder(TreeNode
                .of(1));
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{1}});

        assertListEquals(ex, ac);
    }

    @Test
    void levelOrder3() {
        List<List<Integer>> ac = new Solution()
            .levelOrder(TreeNode
                .of());
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }

}