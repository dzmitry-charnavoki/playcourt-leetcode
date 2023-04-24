package problems.p1000_1100.p1046_last_stone_weight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void lastStoneWeight1() {
        assertEquals(1, new Solution().lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
    }

    @Test
    void lastStoneWeight2() {
        assertEquals(1, new Solution().lastStoneWeight(new int[] {1}));
    }

}