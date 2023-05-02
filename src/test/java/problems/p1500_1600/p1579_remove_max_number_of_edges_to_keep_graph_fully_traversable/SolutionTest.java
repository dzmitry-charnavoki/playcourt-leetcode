package problems.p1500_1600.p1579_remove_max_number_of_edges_to_keep_graph_fully_traversable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxNumEdgesToRemove1() {
        int[][] edges = new int[][] {
            {3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}
        };
        assertEquals(2, new Solution().maxNumEdgesToRemove(4, edges));
    }

    @Test
    void maxNumEdgesToRemove2() {
        int[][] edges = new int[][] {
            {3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}
        };
        assertEquals(0, new Solution().maxNumEdgesToRemove(4, edges));
    }

    @Test
    void maxNumEdgesToRemove3() {
        int[][] edges = new int[][] {
            {3, 2, 3}, {1, 1, 2}, {2, 3, 4}
        };
        assertEquals(-1, new Solution().maxNumEdgesToRemove(4, edges));
    }

    @Test
    void maxNumEdgesToRemove4() {
        int[][] edges = new int[][] {

        };
        assertEquals(0, new Solution().maxNumEdgesToRemove(1, edges));
    }

    @Test
    void maxNumEdgesToRemove5() {
        int[][] edges = new int[][] {
            {1, 1, 2},
            {2, 1, 2},
            {3, 1, 2}
        };
        assertEquals(2, new Solution().maxNumEdgesToRemove(2, edges));
    }

    @Test
    void maxNumEdgesToRemove6() {
        int[][] edges = new int[][] {
            {1, 1, 2},
            {2, 3, 4}
        };
        assertEquals(-1, new Solution().maxNumEdgesToRemove(4, edges));
    }

    @Test
    void maxNumEdgesToRemove8() {
        int[][] edges = new int[][] {
            {3, 1, 2},
            {3, 2, 3},
            {1, 1, 3},
            {1, 1, 4},
            {1, 1, 5},
            {2, 2, 4},
            {2, 2, 5}
        };
        assertEquals(1, new Solution().maxNumEdgesToRemove(5, edges));
    }

    @Test
    void maxNumEdgesToRemove9() {
        int[][] edges = new int[][] {
            {3, 1, 2},
            {3, 2, 3},
            {1, 1, 3},
            {1, 1, 4},
            {1, 1, 5},
            {2, 2, 4},
            {2, 2, 5},
            {1, 3, 4},
            {1, 3, 5},
            {2, 1, 2},
            {2, 1, 5}
        };
        assertEquals(5, new Solution().maxNumEdgesToRemove(5, edges));
    }

    @Test
    void maxNumEdgesToRemove10_AliceCanBobNot() {
        int[][] edges = new int[][] {
            {1, 1, 2},
            {1, 2, 3},
            {1, 3, 4},
            {1, 4, 5},
            {3, 1, 5},
            {2, 1, 3}
        };
        assertEquals(-1, new Solution().maxNumEdgesToRemove(5, edges));
    }

    @Test
    void maxNumEdgesToRemove_AliceNotBobCan() {
        int[][] edges = new int[][] {
            {2, 1, 2},
            {2, 2, 3},
            {2, 3, 4},
            {2, 4, 5},
            {3, 1, 5},
            {1, 1, 3}
        };
        assertEquals(-1, new Solution().maxNumEdgesToRemove(5, edges));
    }

    @Test
    void maxNumEdgesToRemove_11() {
        int[][] edges =
            new int[][] {{1, 1, 2}, {2, 1, 3}, {3, 2, 4}, {3, 2, 5}, {1, 2, 6}, {3, 6, 7},
                {3, 7, 8}, {3, 6, 9}, {3, 4, 10}, {2, 3, 11}, {1, 5, 12}, {3, 3, 13}, {2, 1, 10},
                {2, 6, 11}, {3, 5, 13}, {1, 9, 12}, {1, 6, 8}, {3, 6, 13}, {2, 1, 4}, {1, 1, 13},
                {2, 9, 10}, {2, 1, 6}, {2, 10, 13}, {2, 2, 9}, {3, 4, 12}, {2, 4, 7}, {1, 1, 10},
                {1, 3, 7}, {1, 7, 11}, {3, 3, 12}, {2, 4, 8}, {3, 8, 9}, {1, 9, 13}, {2, 4, 10},
                {1, 6, 9}, {3, 10, 13}, {1, 7, 10}, {1, 1, 11}, {2, 4, 9}, {3, 5, 11}, {3, 2, 6},
                {2, 1, 5}, {2, 5, 11}, {2, 1, 7}, {2, 3, 8}, {2, 8, 9}, {3, 4, 13}, {3, 3, 8},
                {3, 3, 11}, {2, 9, 11}, {3, 1, 8}, {2, 1, 8}, {3, 8, 13}, {2, 10, 11}, {3, 1, 5},
                {1, 10, 11}, {1, 7, 12}, {2, 3, 5}, {3, 1, 13}, {2, 4, 11}, {2, 3, 9}, {2, 6, 9},
                {2, 1, 13}, {3, 1, 12}, {2, 7, 8}, {2, 5, 6}, {3, 1, 9}, {1, 5, 10}, {3, 2, 13},
                {2, 3, 6}, {2, 2, 10}, {3, 4, 11}, {1, 4, 13}, {3, 5, 10}, {1, 4, 10}, {1, 1, 8},
                {3, 3, 4}, {2, 4, 6}, {2, 7, 11}, {2, 7, 10}, {2, 3, 12}, {3, 7, 11}, {3, 9, 10},
                {2, 11, 13}, {1, 1, 12}, {2, 10, 12}, {1, 7, 13}, {1, 4, 11}, {2, 4, 5}, {1, 3, 10},
                {2, 12, 13}, {3, 3, 10}, {1, 6, 12}, {3, 6, 10}, {1, 3, 4}, {2, 7, 9}, {1, 3, 11},
                {2, 2, 8}, {1, 2, 8}, {1, 11, 13}, {1, 2, 13}, {2, 2, 6}, {1, 4, 6}, {1, 6, 11},
                {3, 1, 2}, {1, 1, 3}, {2, 11, 12}, {3, 2, 11}, {1, 9, 10}, {2, 6, 12}, {3, 1, 7},
                {1, 4, 9}, {1, 10, 12}, {2, 6, 13}, {2, 2, 12}, {2, 1, 11}, {2, 5, 9}, {1, 3, 8},
                {1, 7, 8}, {1, 2, 12}, {1, 5, 11}, {2, 7, 12}, {3, 1, 11}, {3, 9, 12}, {3, 2, 9},
                {3, 10, 11}};
        assertEquals(114, new Solution().maxNumEdgesToRemove(13, edges));
    }

    @Test
    public void testDifferentUnionResults() {
        Solution sol = new Solution();

        // 3 edges of type 3, and 1 edge each for Alice and Bob
        int[][] edges = {{3, 1, 2}, {3, 2, 3}, {3, 3, 4}, {1, 1, 4}, {2, 2, 4}};
        int result = sol.maxNumEdgesToRemove(4, edges);

        assertEquals(2, result);
    }
}