package problems.p0100_0200.p0101_symmetric_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isSymmetric_p1() {
        assertTrue(new Solution().isSymmetric(TreeNode.of(1, 2, 2, 3, 4, 4, 3)));
    }

    @Test
    void isSymmetric_p2() {
        assertTrue(new Solution().isSymmetric(TreeNode.of(1, 2, 2, null, 3, 3, null)));
    }

    @Test
    void isSymmetric_n1() {
        assertFalse(new Solution().isSymmetric(TreeNode.of(1, 2, 2, null, 3, null, 3)));
    }

    @Test
    void isSymmetric_n2() {
        assertFalse(new Solution().isSymmetric(TreeNode.of(1, 2, 2, 3, null, 3, null)));
    }

    @Test
    void isSymmetric_p3() {
        assertTrue(new Solution().isSymmetric(TreeNode.of(1, 2, 2, null, 3, 3, null)));
    }

    @Test
    void isSymmetric_p4() {
        assertTrue(new Solution().isSymmetric(TreeNode.of(1, 2, 2, 3, null, null, 3)));
    }

    @Test
    void isSymmetric_n5() {
        assertFalse(new Solution().isSymmetric(TreeNode.of(1, 2, 2, 3, 4, 3, 4)));
    }

    @Test
    void isSymmetric_n6() {
        assertFalse(new Solution().isSymmetric(TreeNode.of(1, 2, 2, 3, 4, 5, 3)));
    }

}