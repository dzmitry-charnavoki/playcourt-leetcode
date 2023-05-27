package problems.p0200_0300.p0226_invert_binary_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void invertTree1() {
        assertEquals("[4, 7, 2, 9, 6, 3, 1]", new Solution()
            .invertTree(TreeNode.of(4, 2, 7, 1, 3, 6, 9))
            .toString());
    }

    @Test
    void invertTree2() {
        assertEquals("[2, 3, 1]", new Solution()
            .invertTree(TreeNode.of(2, 1, 3))
            .toString());
    }
}