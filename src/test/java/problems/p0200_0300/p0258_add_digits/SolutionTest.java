package problems.p0200_0300.p0258_add_digits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void addDigits1() {
        assertEquals(2, new Solution().addDigits(38));
    }

    @Test
    void addDigits2() {
        assertEquals(0, new Solution().addDigits(0));
    }

}