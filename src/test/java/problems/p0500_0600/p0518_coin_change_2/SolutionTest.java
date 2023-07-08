package problems.p0500_0600.p0518_coin_change_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void change() {
        assertEquals(4, new Solution().change(5, new int[] {1, 2, 5}));
    }

    @Test
    void change1() {
        assertEquals(0, new Solution().change(3, new int[] {2}));
    }

    @Test
    void change2() {
        assertEquals(1, new Solution().change(10, new int[] {10}));
    }

}