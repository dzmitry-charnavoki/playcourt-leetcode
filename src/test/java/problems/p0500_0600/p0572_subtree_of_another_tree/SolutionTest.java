package problems.p0500_0600.p0572_subtree_of_another_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isSubtree1() {
        assertTrue(new Solution()
            .isSubtree(TreeNode
                .of(3, 4, 5, 1, 2), TreeNode
                .of(4, 1, 2)));
    }

    @Test
    void isSubtree2() {
        assertTrue(new Solution()
            .isSubtree(TreeNode
                .of(3, 4, 5, null, null, 1, 2), TreeNode
                .of(5, 1, 2)));
    }

    @Test
    void isSubtree_n1() {
        assertFalse(new Solution()
            .isSubtree(TreeNode
                .of(3,4,5,1,2,null,null,null,null,0), TreeNode
                .of(4, 1, 2)));
    }

}