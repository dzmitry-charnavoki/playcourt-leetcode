package problems.p0200_0300.p0235_lowest_common_ancestor_of_a_binary_search_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void lowestCommonAncestor1() {
        assertEquals(6, new Solution()
            .lowestCommonAncestor(
                TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5),
                TreeNode.of(2), TreeNode.of(8))
            .val);
    }
    @Test
    void lowestCommonAncestor2() {
        assertEquals(2, new Solution()
            .lowestCommonAncestor(
                TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5),
                TreeNode.of(2), TreeNode.of(4))
            .val);
    }
    @Test
    void lowestCommonAncestor3() {
        assertEquals(8, new Solution()
            .lowestCommonAncestor(
                TreeNode.of(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5),
                TreeNode.of(9), TreeNode.of(8))
            .val);
    }

    @Test
    void lowestCommonAncestor4() {
        assertEquals(2, new Solution()
            .lowestCommonAncestor(
                TreeNode.of(2, 1),
                TreeNode.of(2), TreeNode.of(1))
            .val);
    }
}