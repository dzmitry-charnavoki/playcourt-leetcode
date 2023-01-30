package problems.p0000_0100.p0069_sqrtx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void mySqrt1() {
        assertEquals(2, new Solution().mySqrt(4));
    }
    @Test
    void mySqrt2() {
        assertEquals(2, new Solution().mySqrt(8));
    }
    @Test
    void mySqrt3() {
        assertEquals(3, new Solution().mySqrt(11));
    }

    @Test
    void mySqrt4() {
        assertEquals(3, new Solution().mySqrt(9));
    }

    @Test
    void mySqrt5() {
        assertEquals(1, new Solution().mySqrt(1));
    }
}