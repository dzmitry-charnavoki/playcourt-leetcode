package problems.p0000_0100.p0006_zigzag_conversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void convert1() {
        assertEquals("PAHNAPLSIIGYIR", new Solution().convert("PAYPALISHIRING", 3));
    }

    @Test
    void convert2() {
        assertEquals("PINALSIGYAHRPI", new Solution().convert("PAYPALISHIRING", 4));
    }

    @Test
    void convert3() {
        assertEquals("A", new Solution().convert("A", 1));
    }
}