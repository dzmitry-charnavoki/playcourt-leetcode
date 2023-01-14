package problems.p0000_0100.p0029_divide_two_integers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void divide11() {
        assertEquals(3, new Solution().divide(10, 3));
    }

    @Test
    void divide12() {
        assertEquals(9, new Solution().divide(28, 3));
    }

    @Test
    void divide13() {
        assertEquals(1, new Solution().divide(3, 3));
    }

    @Test
    void divide2() {
        assertEquals(-2, new Solution().divide(7, -3));
    }

    @Test
    void divide3() {
        assertEquals(Integer.MIN_VALUE, new Solution().divide(Integer.MIN_VALUE, 1));
    }

    @Test
    void divide4() {
        assertEquals(Integer.MAX_VALUE, new Solution().divide(Integer.MIN_VALUE, -1));
    }
}