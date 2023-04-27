package problems.p0300_0400.p0319_bulb_switcher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void bulbSwitch1() {
        assertEquals(1, new Solution().bulbSwitch(3));
    }

    @Test
    void bulbSwitch2() {
        assertEquals(0, new Solution().bulbSwitch(0));
    }

    @Test
    void bulbSwitch3() {
        assertEquals(1, new Solution().bulbSwitch(1));
    }

}