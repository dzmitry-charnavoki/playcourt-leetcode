package problems.p0000_0100.p0094_binary_tree_inorder_traversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void inorderTraversal1() {
        TreeNode tn = TreeNode.of(1, null, 2, 3);
        assertEquals("[1, 3, 2]", new Solution().inorderTraversal(tn).toString());
    }

    @Test
    void inorderTraversal2() {
        TreeNode tn = TreeNode.of();
        assertEquals("[]", new Solution().inorderTraversal(tn).toString());
    }

    @Test
    void inorderTraversal3() {
        TreeNode tn = TreeNode.of(1);
        assertEquals("[1]", new Solution().inorderTraversal(tn).toString());
    }
}