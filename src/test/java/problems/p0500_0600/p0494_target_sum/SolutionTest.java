package problems.p0500_0600.p0494_target_sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findTargetSumWays() {
        assertEquals(5, new Solution().findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3));
    }
    @Test
    void findTargetSumWays1() {
        assertEquals(3, new Solution().findTargetSumWays(new int[] {1, 2, 3, 4, 5}, 5));
    }

    @Test
    void findTargetSumWays2() {
        assertEquals(1, new Solution().findTargetSumWays(new int[] {1}, 1));
    }
    @Test
    void findTargetSumWays3() {
        assertEquals(0, new Solution().findTargetSumWays(new int[] {1,1}, 3));
    }
    @Test
    void findTargetSumWays4() {
        assertEquals(0, new Solution().findTargetSumWays(new int[] {1,5}, 3));
    }


    @Test
    void findTargetSumWays21() {
        assertEquals(5, new Solution().findTargetSumWays2(new int[] {1, 1, 1, 1, 1}, 3));
    }
    @Test
    void findTargetSumWays22() {
        assertEquals(3, new Solution().findTargetSumWays2(new int[] {1, 2, 3, 4, 5}, 5));
    }

    @Test
    void findTargetSumWays23() {
        assertEquals(1, new Solution().findTargetSumWays2(new int[] {1}, 1));
    }
    @Test
    void findTargetSumWays24() {
        assertEquals(0, new Solution().findTargetSumWays2(new int[] {1,1}, 3));
    }
    @Test
    void findTargetSumWays25() {
        assertEquals(0, new Solution().findTargetSumWays2(new int[] {1,5}, 3));
    }

}