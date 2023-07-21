package problems.p0200_0300.p0202_happy_number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isHappy1() {
        assertTrue(new Solution().isHappy(19));
    }

    @Test
    void isHappy2() {
        assertFalse(new Solution().isHappy(2));
    }
    @Test
    void isHappy3() {
        assertTrue(new Solution().isHappy(7));
    }

}