package problems.p0000_0100.p0045_jump_game_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void jump1() {
        assertEquals(2, new Solution().jump(new int[] {2, 3, 1, 1, 4}));
    }

    @Test
    void jump2() {
        assertEquals(2, new Solution().jump(new int[] {2, 3, 0, 1, 4}));
    }

    @Test
    void jump3() {
        assertEquals(3, new Solution().jump(new int[] {2, 3, 1, 0, 2, 2, 3}));
    }

    @Test
    void jump4() {
        assertEquals(6, new Solution().jump2(new int[] {2, 3, 0, 1, 4, 3, 2, 1, 1, 2, 1, 3, 4, 5}));
    }

    @Test
    void jump5() {
        assertEquals(2, new Solution().jump2(new int[] {2, 3, 1, 1, 4}));
    }

}