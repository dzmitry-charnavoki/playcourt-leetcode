package problems.p0000_0100.p0020_valid_parentheses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isValid_p1() {
        assertTrue(new Solution().isValid("[()]{}{[()()]()}"));
    }

    @Test
    void isValid_n1() {
        assertFalse(new Solution().isValid("[(])"));
    }

    @Test
    void isValid_n2() {
        assertFalse(new Solution().isValid("[("));
    }

    @Test
    void isValid_n3() {
        assertFalse(new Solution().isValid("]}"));
    }


}