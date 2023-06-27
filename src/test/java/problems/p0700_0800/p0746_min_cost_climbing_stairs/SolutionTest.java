package problems.p0700_0800.p0746_min_cost_climbing_stairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minCostClimbingStairs1() {
        assertEquals(15, new Solution()
            .minCostClimbingStairs(new int[] {10, 15, 20}));
    }

    @Test
    void minCostClimbingStairs2() {
        assertEquals(6, new Solution()
            .minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

}