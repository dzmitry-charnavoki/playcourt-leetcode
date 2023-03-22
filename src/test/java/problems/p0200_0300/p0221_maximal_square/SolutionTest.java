package problems.p0200_0300.p0221_maximal_square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maximalSquare1() {
        char[][] in = new char[][] {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertEquals(4, new Solution().maximalSquare(in));
    }

    @Test
    void maximalSquare11() {
        char[][] in = new char[][] {
            {'1', '0', '1', '1'},
            {'1', '1', '0', '1'},
            {'1', '1', '1', '1'}
        };
        assertEquals(4, new Solution().maximalSquare(in));
    }

    @Test
    void maximalSquare2() {
        char[][] in = new char[][] {
            {'0', '1'},
            {'1', '0'}
        };
        assertEquals(1, new Solution().maximalSquare(in));
    }

    @Test
    void maximalSquare3() {
        char[][] in = new char[][] {
            {'0'}
        };
        assertEquals(0, new Solution().maximalSquare(in));
    }
}