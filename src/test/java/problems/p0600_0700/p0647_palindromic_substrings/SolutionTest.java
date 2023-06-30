package problems.p0600_0700.p0647_palindromic_substrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void countSubstrings1() {
        assertEquals(3, new Solution().countSubstrings("abc"));
    }

    @Test
    void countSubstrings2() {
        assertEquals(6, new Solution().countSubstrings("aaa"));
    }

}