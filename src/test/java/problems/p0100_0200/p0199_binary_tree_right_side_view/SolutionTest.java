package problems.p0100_0200.p0199_binary_tree_right_side_view;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void rightSideView1() {
        assertEquals("[1, 3, 4]",
            new Solution()
                .rightSideView(TreeNode.of(1, 2, 3, null, 5, null, 4))
                .toString());
    }

    @Test
    void rightSideView2() {
        assertEquals("[1, 3]",
            new Solution()
                .rightSideView(TreeNode.of(1, null, 3))
                .toString());
    }

    @Test
    void rightSideView3() {
        assertEquals("[]",
            new Solution()
                .rightSideView(TreeNode.of())
                .toString());
    }

    @Test
    void rightSideView4() {
        assertEquals("[1, 3, 4]",
            new Solution()
                .rightSideView(TreeNode.of(1, 2, 3, 4))
                .toString());
    }

// ---------------------------------
    @Test
    void rightSideView21() {
        assertEquals("[1, 3, 4]",
            new Solution()
                .rightSideViewDFS(TreeNode.of(1, 2, 3, null, 5, null, 4))
                .toString());
    }

    @Test
    void rightSideView22() {
        assertEquals("[1, 3]",
            new Solution()
                .rightSideViewDFS(TreeNode.of(1, null, 3))
                .toString());
    }

    @Test
    void rightSideView23() {
        assertEquals("[]",
            new Solution()
                .rightSideViewDFS(TreeNode.of())
                .toString());
    }

    @Test
    void rightSideView24() {
        assertEquals("[1, 3, 4]",
            new Solution()
                .rightSideViewDFS(TreeNode.of(1, 2, 3, 4))
                .toString());
    }
}