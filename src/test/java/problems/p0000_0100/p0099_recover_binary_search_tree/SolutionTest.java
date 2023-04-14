package problems.p0000_0100.p0099_recover_binary_search_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void recoverTree1() {
        TreeNode tn = TreeNode.of(1, 3, null, null, 2);
        new Solution().recoverTree(tn);
        assertEquals("[3, 1, null, null, 2]", tn.toString());
    }

    @Test
    void recoverTree2() {
        TreeNode tn = TreeNode.of(3, 1, 4, null, null, 2);
        new Solution().recoverTree(tn);
        assertEquals("[2, 1, 4, 3, null]", tn.toString());
    }
}