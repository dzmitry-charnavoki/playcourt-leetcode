package problems.p0000_0100.p0095_unique_binary_search_trees_ii;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void generateTrees1() {
        List<TreeNode> ltn = new Solution().generateTrees(3);
        assertEquals(5, ltn.size());
        assertEquals("[1, null, 2, null, 3]", ltn.get(0).toString());
        assertEquals("[1, null, 3, 2, null]", ltn.get(1).toString());
        assertEquals("[2, 1, 3]", ltn.get(2).toString());
        assertEquals("[3, 1, null, null, 2]", ltn.get(3).toString());
        assertEquals("[3, 2, null, 1, null]", ltn.get(4).toString());
    }

    @Test
    void generateTrees2() {
        List<TreeNode> ltn = new Solution().generateTrees(1);
        assertEquals("[[1]]", ltn.toString());
    }
}