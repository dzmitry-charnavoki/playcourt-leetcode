package problems.p0600_0700.p0662_maximum_width_of_binary_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void widthOfBinaryTree1() {
        assertEquals(4, new Solution()
            .widthOfBinaryTree(TreeNode
                .of(1, 3, 2, 5, 3, null, 9)));
    }

    @Test
    void widthOfBinaryTree2() {
        assertEquals(7, new Solution()
            .widthOfBinaryTree(TreeNode
                .of(1, 3, 2, 5, null, null, 9, 6, null, 7)));
    }

    @Test
    void widthOfBinaryTree3() {
        assertEquals(2, new Solution()
            .widthOfBinaryTree(TreeNode
                .of(1, 3, 2, 5)));
    }

}