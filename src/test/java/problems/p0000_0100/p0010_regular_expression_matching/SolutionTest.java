package problems.p0000_0100.p0010_regular_expression_matching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class SolutionTest {

    @Test
    void isMatch_p1() {
        assertTrue(new Solution().isMatchBottomUp("aa", "a*"));
    }

    @Test
    void isMatch_p2() {
        assertTrue(new Solution().isMatchBottomUp("ab", ".*"));
    }

    @Test
    void isMatch_p3() {
        assertTrue(new Solution().isMatchBottomUp("aaa", "a*a"));
    }

    @Test
    void isMatch_p4() {
        assertTrue(new Solution().isMatchBottomUp("aab", "c*a*b"));
    }

    @Test
    void isMatch_n1() {
        assertFalse(new Solution().isMatchBottomUp("aa", "a"));
    }

    @Test
    void isMatch_n2() {
        assertFalse(new Solution().isMatchBottomUp("ab", ".*c"));
    }

    @Test
    void isMatch_n3() {
        assertFalse(new Solution().isMatchBottomUp("mississippi", "mis*is*p*."));
    }

 @Test
    void isMatch1_p1() {
        assertTrue(new Solution().isMatchRecursion("aa", "a*"));
    }

    @Test
    void isMatch1_p2() {
        assertTrue(new Solution().isMatchRecursion("ab", ".*"));
    }

    @Test
    void isMatch1_p3() {
        assertTrue(new Solution().isMatchRecursion("aaa", "a*a"));
    }

    @Test
    void isMatch1_p31() {
        assertTrue(new Solution().isMatchRecursion("aaaaadf", "a*adf"));
    }
    @Test
    void isMatch1_p4() {
        assertTrue(new Solution().isMatchRecursion("aab", "c*a*b"));
    }

    @Test
    void isMatch1_n1() {
        assertFalse(new Solution().isMatchRecursion("aa", "a"));
    }

    @Test
    void isMatch1_n2() {
        assertFalse(new Solution().isMatchRecursion("ab", ".*c"));
    }

    @Test
    void isMatch1_n3() {
        assertFalse(new Solution().isMatchRecursion("mississippi", "mis*is*p*."));
    }

}