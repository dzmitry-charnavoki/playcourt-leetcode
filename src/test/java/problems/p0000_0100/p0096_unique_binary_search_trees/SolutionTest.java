package problems.p0000_0100.p0096_unique_binary_search_trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numTrees1() {
        assertEquals(5, new Solution().numTrees(3));
    }

    @Test
    void numTrees2() {
        assertEquals(1, new Solution().numTrees(1));
    }
}