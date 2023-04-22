package problems.p0100_0200.p0105_construct_binary_tree_from_preorder_and_inorder_traversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void buildTree1() {

        assertEquals("[3, 9, 20, 15, 7]",
            new Solution().buildTree(new int[] {3, 9, 20, 15, 7},
                new int[] {9, 3, 15, 20, 7}).toString());
    }

    @Test
    void buildTree2() {
        assertEquals("[-1]",
            new Solution().buildTree(new int[] {-1},
                new int[] {-1}).toString());
    }
}