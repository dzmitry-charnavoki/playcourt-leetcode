package problems.p0000_0100.p0007_reverse_integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reverse1() {
        assertEquals(321, new Solution().reverse(123));
    }

    @Test
    void reverse2() {
        assertEquals(-321, new Solution().reverse(-123));
    }
    @Test
    void reverse3() {
        assertEquals(21, new Solution().reverse(120));
    }

    @Test
    void reverse4() {
        assertEquals(0, new Solution().reverse(1534236469));
    }

    @Test
    void reverse5() {
        assertEquals(0, new Solution().reverse(-1534236469));
    }

}