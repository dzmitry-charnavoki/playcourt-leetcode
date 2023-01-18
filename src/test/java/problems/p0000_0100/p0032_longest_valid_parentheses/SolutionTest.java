package problems.p0000_0100.p0032_longest_valid_parentheses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void longestValidParentheses1() {
        assertEquals(2, new Solution().longestValidParentheses("(()"));
    }

    @Test
    void longestValidParentheses2() {
        assertEquals(4, new Solution().longestValidParentheses(")()())"));
    }

    @Test
    void longestValidParentheses3() {
        assertEquals(0, new Solution().longestValidParentheses(""));
    }

    @Test
    void longestValidParentheses4() {
        assertEquals(2, new Solution().longestValidParentheses(")()(()"));
    }

}