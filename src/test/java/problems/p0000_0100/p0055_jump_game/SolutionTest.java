package problems.p0000_0100.p0055_jump_game;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canJump1() {
        assertTrue(new Solution().canJump(new int[] {2, 3, 1, 1, 4}));
    }

    @Test
    void canJump2() {
        assertFalse(new Solution().canJump(new int[] {3, 2, 1, 0, 4}));
    }

    @Test
    void canJump3() {
        assertTrue(new Solution().canJump(new int[] {0}));
    }

    @Test
    void canJump4() {
        int countElements = 10000;
        int[] intArray = new int[countElements];
        Arrays.fill(intArray, 0);
        intArray[0] = countElements;
        assertTrue(new Solution().canJump(intArray));
    }
}