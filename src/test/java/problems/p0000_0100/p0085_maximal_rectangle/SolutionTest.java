package problems.p0000_0100.p0085_maximal_rectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maximalRectangle1() {
        assertEquals(6, new Solution().maximalRectangle(new char[][] {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        }));
    }

    @Test
    void maximalRectangle2() {
        assertEquals(0, new Solution().maximalRectangle(new char[][] {
            {'0'}
        }));
    }

    @Test
    void maximalRectangle3() {
        assertEquals(1, new Solution().maximalRectangle(new char[][] {
            {'1'}
        }));
    }
}