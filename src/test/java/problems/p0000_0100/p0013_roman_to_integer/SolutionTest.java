package problems.p0000_0100.p0013_roman_to_integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void intToRoman11() {
        assertEquals(3, new Solution().romanToInt("III"));
    }

    @Test
    void intToRoman12() {
        assertEquals(58, new Solution().romanToInt("LVIII"));
    }

    @Test
    void intToRoman13() {
        assertEquals(1994, new Solution().romanToInt("MCMXCIV"));
    }
}