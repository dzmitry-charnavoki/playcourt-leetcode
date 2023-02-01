package problems.p0100_0200.p0125_valid_palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isPalindrome1() {
        assertTrue(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome2() {
        assertFalse(new Solution().isPalindrome("race a car"));
    }

    @Test
    void isPalindrome3() {
        assertTrue(new Solution().isPalindrome(" "));
    }
}