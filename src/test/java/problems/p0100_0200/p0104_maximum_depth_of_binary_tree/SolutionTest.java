package problems.p0100_0200.p0104_maximum_depth_of_binary_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxDepth1() {
        assertEquals(3, new Solution().maxDepth(TreeNode.of(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    void maxDepth2() {
        assertEquals(2, new Solution().maxDepth(TreeNode.of(1, null, 2)));
    }

}