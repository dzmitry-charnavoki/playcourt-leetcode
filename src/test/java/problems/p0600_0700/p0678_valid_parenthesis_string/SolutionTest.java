package problems.p0600_0700.p0678_valid_parenthesis_string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void checkValidString1() {
        assertTrue(new Solution().checkValidString("()"));
    }

    @Test
    void checkValidString2() {
        assertTrue(new Solution().checkValidString("(*)"));
    }

    @Test
    void checkValidString3() {
        assertTrue(new Solution().checkValidString("(*))"));
    }

    @Test
    void checkValidString_n1() {
        assertFalse(new Solution().checkValidString("("));
    }

    @Test
    void checkValidString4() {
        assertTrue(new Solution().checkValidString("()********"));
        assertTrue(new Solution().checkValidString("((((****"));
        assertTrue(new Solution().checkValidString("((*)****"));
        assertTrue(new Solution().checkValidString("(*)()"));
        assertTrue(new Solution().checkValidString("()*)"));
        assertTrue(new Solution().checkValidString("(((******))"));
    }
    @Test
    void checkValidString_n2() {
        assertFalse(new Solution().checkValidString(")*("));
        assertFalse(new Solution().checkValidString(")("));
        assertFalse(new Solution().checkValidString("*("));
        assertFalse(new Solution().checkValidString("(*)("));
        assertFalse(new Solution().checkValidString("(*)*(((*"));
        assertFalse(new Solution().checkValidString("((*)***(((*"));
        assertFalse(new Solution().checkValidString("(*)*()*(((*"));
    }

}