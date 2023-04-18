package problems.p0100_0200.p0103_binary_tree_zigzag_level_order_traversal;

import static problems.AssertionOfList.assertListEquals;

import java.util.List;
import letcode.TreeNode;
import org.junit.jupiter.api.Test;
import utils.ListUtils;

class SolutionTest {

    @Test
    void zigzagLevelOrder1() {
        List<List<Integer>> ac = new Solution()
            .zigzagLevelOrder(TreeNode
                .of(3,9,20,null,null,15,7));
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{3}, {20, 9}, {15, 7}});
        assertListEquals(ex, ac);
    }

    @Test
    void zigzagLevelOrder2() {
        List<List<Integer>> ac = new Solution()
            .zigzagLevelOrder(TreeNode
                .of(1));
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {{1}});

        assertListEquals(ex, ac);
    }

    @Test
    void zigzagLevelOrder3() {
        List<List<Integer>> ac = new Solution()
            .zigzagLevelOrder(TreeNode
                .of());
        List<List<Integer>> ex =
            ListUtils.getLists(new int[][] {});
        assertListEquals(ex, ac);
    }

}