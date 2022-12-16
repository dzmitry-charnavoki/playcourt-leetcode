package problems.p0000_0100.p0009_palindrome_number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isPalindrome11() {
        assertEquals(true, new Solution().isPalindrome(121));
    }

    @Test
    void isPalindrome12() {
        assertEquals(false, new Solution().isPalindrome(-121));
    }

    @Test
    void isPalindrome13() {
        assertEquals(false, new Solution().isPalindrome(10));
    }

    @Test
    void isPalindrome14() {
        assertEquals(false, new Solution().isPalindrome(1234));
    }

}