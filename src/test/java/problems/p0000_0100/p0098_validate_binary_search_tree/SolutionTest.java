package problems.p0000_0100.p0098_validate_binary_search_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isValidBST1() {
        assertTrue(new Solution().isValidBST(TreeNode.of(2, 1, 3)));
    }

    @Test
    void isValidBST2() {
        assertTrue(new Solution().isValidBST(TreeNode.of(2147483647)));
    }

    @Test
    void isValidBST_n1() {
        assertFalse(new Solution().isValidBST(TreeNode.of(5, 1, 4, null, null, 3, 6)));
    }

    @Test
    void isValidBST_n2() {
        assertFalse(new Solution().isValidBST(TreeNode.of(5, 1, 7, null, null, 4, 6)));
    }

    @Test
    void isValidBST_n3() {
        assertFalse(new Solution().isValidBST(TreeNode.of(2, 3, 1)));
        assertFalse(new Solution().isValidBST(TreeNode.of(2, 1, 1)));
        assertFalse(new Solution().isValidBST(TreeNode.of(2, 3, 3)));
    }
}