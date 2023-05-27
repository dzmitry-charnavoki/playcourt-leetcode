package problems.p0500_0600.p0543_diameter_of_binary_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void diameterOfBinaryTree1() {
        assertEquals(3, new Solution()
            .diameterOfBinaryTree(TreeNode
                .of(1, 2, 3, 4, 5)));
    }

    @Test
    void diameterOfBinaryTree2() {
        assertEquals(1, new Solution()
            .diameterOfBinaryTree(TreeNode
                .of(1, 2)));
    }

    @Test
    void diameterOfBinaryTree3() {
        assertEquals(8, new Solution()
            .diameterOfBinaryTree(TreeNode
                .of(4, -7, -3, null, null, -9, -3, 9, -7, -4, null, 6, null, -6, -6, null, null, 0,
                    6, 5, null, 9, null, null, -1, -4, null, null, null, -2)));
    }

}