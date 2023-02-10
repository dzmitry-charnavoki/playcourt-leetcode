package problems.p0000_0100.p0044_wildcard_matching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isMatch1() {
        assertFalse(new Solution().isMatch("aa", "a"));
    }

    @Test
    void isMatch2() {
        assertTrue(new Solution().isMatch("aa", "*"));
    }

    @Test
    void isMatch3() {
        assertFalse(new Solution().isMatch("cb", "?a"));
    }

    @Test
    void isMatch4() {
        assertTrue(new Solution().isMatch("adceb", "*a*b"));
    }
    @Test
    void isMatch5() {
        assertFalse(new Solution().isMatch("acdcb", "a*c?b"));
    }
    @Test
    void isMatch6() {
        assertTrue(new Solution().isMatch("acdvdfvdcb", "a*c??d*"));
    }
    @Test
    void isMatch7() {
        assertFalse(new Solution().isMatch("ac", "a*c**d*"));
    }
    @Test
    void isMatch8() {
        assertFalse(new Solution().isMatch("acdvdfvdcb", "a*kvd*"));
    }
}