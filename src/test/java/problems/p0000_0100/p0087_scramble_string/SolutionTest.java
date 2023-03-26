package problems.p0000_0100.p0087_scramble_string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isScramble1() {
        assertTrue(new Solution().isScramble("great", "rgeat"));
    }

    @Test
    void isScramble2() {
        assertFalse(new Solution().isScramble("abcde", "caebd"));
    }

    @Test
    void isScramble3() {
        assertTrue(new Solution().isScramble("a", "a"));
    }

}