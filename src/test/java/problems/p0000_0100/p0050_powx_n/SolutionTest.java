package problems.p0000_0100.p0050_powx_n;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void myPow1() {
        assertEquals(1024d, new Solution().myPow(2, 10), 1e-1);
    }

    @Test
    void myPow2() {
        assertEquals(9.261d, new Solution().myPow(2.1, 3), 1e-3);
    }

    @Test
    void myPow3() {
        assertEquals(0.25d, new Solution().myPow(2, -2));
    }

}