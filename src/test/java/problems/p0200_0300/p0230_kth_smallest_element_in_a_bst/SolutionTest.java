package problems.p0200_0300.p0230_kth_smallest_element_in_a_bst;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void kthSmallest1() {
        assertEquals(1, new Solution()
            .kthSmallest(TreeNode
                .of(3, 1, 4, null, 2), 1));
    }

    @Test
    void kthSmallest2() {
        assertEquals(3, new Solution()
            .kthSmallest(TreeNode
                .of(5, 3, 6, 2, 4, null, null, 1), 3));
    }

    @Test
    void kthSmallest3() {
        assertEquals(2, new Solution()
            .kthSmallest(TreeNode
                .of(3, 1, 4, null, 2), 2));
    }

    @Test
    void kthSmallest4() {
        assertEquals(3, new Solution()
            .kthSmallest(TreeNode
                .of(5, 3, 6, 2, 4, null, null, 1), 3));
    }

    @Test
    void kthSmallest5() {
        assertEquals(-1, new Solution()
            .kthSmallest(TreeNode
                .of(5, 3, 6, 2, 4, null, null, 1), 10));
    }

}