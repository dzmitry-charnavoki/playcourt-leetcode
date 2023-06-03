package problems.p0100_0200.p0124_binary_tree_maximum_path_sum;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxPathSum1() {
        assertEquals(6, new Solution()
            .maxPathSum(TreeNode
                .of(1, 2, 3)));
    }

    @Test
    void maxPathSum2() {
        assertEquals(42, new Solution()
            .maxPathSum(TreeNode
                .of(-10, 9, 20, null, null, 15, 7)));
    }

}