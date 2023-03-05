package problems.p0000_0100.p0065_valid_number;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isNumber1() {
        assertTrue(new Solution().isNumber("0"));
    }

    @Test
    void isNumber2() {
        assertTrue(new Solution().isNumber("2"));
    }

    @Test
    void isNumber3() {
        assertTrue(new Solution().isNumber("0089"));
    }

    @Test
    void isNumber4() {
        assertTrue(new Solution().isNumber("-0.1"));
    }

    @Test
    void isNumber5() {
        assertTrue(new Solution().isNumber("+3.14"));
    }

    @Test
    void isNumber6() {
        assertTrue(new Solution().isNumber("4."));
    }

    @Test
    void isNumber7() {
        assertTrue(new Solution().isNumber("2e10"));
        assertTrue(new Solution().isNumber("-90E3"));
        assertTrue(new Solution().isNumber("3e+7"));
        assertTrue(new Solution().isNumber("+6e-1"));
        assertTrue(new Solution().isNumber("53.5e93"));
        assertTrue(new Solution().isNumber("-123.456e789"));
    }

    @Test
    void isNumber8() {
        assertFalse(new Solution().isNumber("e"));
    }

    @Test
    void isNumber9() {
        assertFalse(new Solution().isNumber("."));
    }

    @Test
    void isNumber10() {
        assertFalse(new Solution().isNumber("abc"));
        assertFalse(new Solution().isNumber("1a"));
        assertFalse(new Solution().isNumber("1e"));
        assertFalse(new Solution().isNumber("1..e"));
        assertFalse(new Solution().isNumber("1ee."));
        assertFalse(new Solution().isNumber("e3"));
        assertFalse(new Solution().isNumber("e--3"));
        assertFalse(new Solution().isNumber("E--3"));
        assertFalse(new Solution().isNumber("e++3"));
        assertFalse(new Solution().isNumber("99e2.5"));
        assertFalse(new Solution().isNumber("--6"));
        assertFalse(new Solution().isNumber("-+3"));
        assertFalse(new Solution().isNumber("95a54e53"));
    }
}