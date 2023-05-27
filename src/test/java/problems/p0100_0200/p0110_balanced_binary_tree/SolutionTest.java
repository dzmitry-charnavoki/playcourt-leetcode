package problems.p0100_0200.p0110_balanced_binary_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isBalanced1() {
        assertTrue(new Solution()
            .isBalanced(TreeNode
                .of(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    void isBalanced2() {
        assertFalse(new Solution()
            .isBalanced(TreeNode
                .of(1, 2, 2, 3, 3, null, null, 4, 4)));
    }

    @Test
    void isBalanced3() {
        assertTrue(new Solution()
            .isBalanced(TreeNode
                .of(null)));
    }

}