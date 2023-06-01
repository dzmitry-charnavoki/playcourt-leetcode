package problems.p1400_1500.p1448_count_good_nodes_in_binary_tree;

import static org.junit.jupiter.api.Assertions.*;

import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void goodNodes1() {
        assertEquals(4, new Solution()
            .goodNodes(TreeNode
                .of(3, 1, 4, 3, null, 1, 5)));
    }
    @Test
    void goodNodes2() {
        assertEquals(3, new Solution()
            .goodNodes(TreeNode
                .of(3,3,null,4,2)));
    }
    @Test
    void goodNodes3() {
        assertEquals(1, new Solution()
            .goodNodes(TreeNode
                .of(1)));
    }
}