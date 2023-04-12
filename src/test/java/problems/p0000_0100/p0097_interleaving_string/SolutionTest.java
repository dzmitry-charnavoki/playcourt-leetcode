package problems.p0000_0100.p0097_interleaving_string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isInterleave1() {
        assertTrue(new Solution().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void isInterleave2() {
        assertFalse(new Solution().isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    void isInterleave3() {
        assertTrue(new Solution().isInterleave("", "", ""));
    }

    @Test
    void isInterleave4() {
        assertFalse(new Solution().isInterleave("aabcc", "dbbca", "aadbbbacccds"));
    }

    @Test
    void isInterleave5() {
        assertTrue(new Solution().isInterleave("dbbca", "aabcc", "aadbbcbcac"));
    }
}