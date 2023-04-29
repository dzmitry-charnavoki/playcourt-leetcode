package problems.p0100_0200.p0107_binary_tree_level_order_traversal_ii;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void levelOrderBottom1() {
        assertEquals("[[15, 7], [9, 20], [3]]", new Solution()
            .levelOrderBottom(TreeNode
                .of(3, 9, 20, null, null, 15, 7))
            .toString());
    }

    @Test
    void levelOrderBottom2() {
        assertEquals("[[1]]", new Solution()
            .levelOrderBottom(TreeNode
                .of(1))
            .toString());
    }

    @Test
    void levelOrderBottom3() {
        assertEquals("[]", new Solution()
            .levelOrderBottom(null).toString());
    }

}