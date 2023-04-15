package problems.p0100_0200.p0100_same_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isSameTree1() {
        assertTrue(new Solution()
            .isSameTree(TreeNode.of(1, 2, 3), TreeNode.of(1, 2, 3)));
    }

    @Test
    void isSameTree11() {
        assertFalse(new Solution()
            .isSameTree(TreeNode.of(1, 2, 3), TreeNode.of(1, 2, 4)));
    }
    @Test
    void isSameTree2() {
        assertFalse(new Solution()
            .isSameTree(TreeNode.of(1, 2), TreeNode.of(1, null, 2)));
    }

    @Test
    void isSameTree22() {
        assertFalse(new Solution()
            .isSameTree(TreeNode.of(1, null, 2), TreeNode.of(1, 2)));
    }

    @Test
    void isSameTree3() {
        assertFalse(new Solution()
            .isSameTree(TreeNode.of(1, 2, 1), TreeNode.of(1, 1, 2)));
    }

}