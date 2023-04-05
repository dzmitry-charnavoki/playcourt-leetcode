package problems.p0000_0100.p0091_decode_ways;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numDecodings1() {
        assertEquals(2, new Solution().numDecodings("12"));
    }

    @Test
    void numDecodings2() {
        assertEquals(3, new Solution().numDecodings("226"));
    }
    @Test
    void numDecodings3() {
        assertEquals(0, new Solution().numDecodings("06"));
    }

}