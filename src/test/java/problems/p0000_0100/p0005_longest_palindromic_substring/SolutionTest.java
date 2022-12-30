package problems.p0000_0100.p0005_longest_palindromic_substring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestPalindrome1() {
        assertEquals("bab", new Solution().longestPalindrome("babad"));
    }

    @Test
    void longestPalindrome2() {
        assertEquals("bb", new Solution().longestPalindrome("cbbd"));
    }

//    @Test
//    void longestPalindrome3() {
//        assertEquals("bab", new Solution().longestPalindrome1("babad"));
//    }

}