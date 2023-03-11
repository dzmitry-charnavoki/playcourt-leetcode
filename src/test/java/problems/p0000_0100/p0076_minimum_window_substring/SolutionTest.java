package problems.p0000_0100.p0076_minimum_window_substring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minWindow1() {
        assertEquals("BANC", new Solution().minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void minWindow2() {
        assertEquals("a", new Solution().minWindow("a", "a"));
    }

    @Test
    void minWindow3() {
        assertEquals("", new Solution().minWindow("a", "aa"));
    }

    @Test
    void minWindow4() {
        assertEquals("", new Solution().minWindow("a", ""));
    }
    @Test
    void minWindow5() {
        assertEquals("cwae", new Solution().minWindow("cabwefgewcwaefgcf", "cae"));
    }

    @Test
    void minWindow_s21() {
        assertEquals("BANC", new Solution().minWindow2("ADOBECODEBANC", "ABC"));
    }

    @Test
    void minWindow_s22() {
        assertEquals("a", new Solution().minWindow2("a", "a"));
    }

    @Test
    void minWindow_s23() {
        assertEquals("", new Solution().minWindow2("a", "aa"));
    }

    @Test
    void minWindow_s24() {
        assertEquals("", new Solution().minWindow2("a", ""));
    }

}