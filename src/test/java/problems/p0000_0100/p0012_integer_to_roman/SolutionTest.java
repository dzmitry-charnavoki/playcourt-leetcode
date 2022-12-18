package problems.p0000_0100.p0012_integer_to_roman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void intToRoman11() {
        assertEquals("III", new Solution().intToRoman(3));
    }

    @Test
    void intToRoman12() {
        assertEquals("LVIII", new Solution().intToRoman(58));
    }

    @Test
    void intToRoman13() {
        assertEquals("MCMXCIV", new Solution().intToRoman(1994));
    }
}