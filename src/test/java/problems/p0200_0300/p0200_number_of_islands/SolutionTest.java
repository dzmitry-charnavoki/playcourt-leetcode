package problems.p0200_0300.p0200_number_of_islands;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numIslands1() {
        char[][] exp = new char[][] {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, new Solution().numIslands(exp));
    }

    @Test
    void numIslands2() {
        char[][] exp = new char[][] {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, new Solution().numIslands(exp));
    }

    @Test
    void numIslands2_1() {
        char[][] exp = new char[][] {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, new Solution().numIslands2(exp));
    }

    @Test
    void numIslands2_2() {
        char[][] exp = new char[][] {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, new Solution().numIslands2(exp));
    }

}