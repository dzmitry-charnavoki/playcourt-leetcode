package problems.p0000_0100.p0008_string_to_integer_atoi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void myAtoi01() {
        assertEquals(0, new Solution().myAtoi("+-12"));
    }
    @Test
    void myAtoi02() {
        assertEquals(0, new Solution().myAtoi("-+12"));
    }

    @Test
    void myAtoi1() {
        assertEquals(42, new Solution().myAtoi("42"));
    }

    @Test
    void myAtoi2() {
        assertEquals(-42, new Solution().myAtoi("   -42"));
    }

    @Test
    void myAtoi3() {
        assertEquals(4193, new Solution().myAtoi("4193 with words"));
    }

    @Test
    void myAtoi4() {
        assertEquals(0, new Solution().myAtoi("words and 987"));
    }

    @Test
    void myAtoi5() {
        assertEquals(33, new Solution().myAtoi("  033 stop"));
    }

    @Test
    void myAtoi6() {
        assertEquals(-2147483648, new Solution().myAtoi("-91283472332"));
    }

    @Test
    void myAtoi7() {
        assertEquals(0, new Solution().myAtoi("00000-42a1234"));
    }

    @Test
    void myAtoi8() {
        assertEquals(0, new Solution().myAtoi(""));
    }

    @Test
    void myAtoi9() {
        assertEquals(2147483647, new Solution().myAtoi("9223372036854775808"));
    }
}