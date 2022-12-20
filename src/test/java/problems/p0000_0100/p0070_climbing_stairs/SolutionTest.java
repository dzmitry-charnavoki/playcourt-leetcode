package problems.p0000_0100.p0070_climbing_stairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void climbStairs11() {
        assertEquals(2, new Solution().climbStairs(2));
    }

    @Test
    void climbStairs12() {
        assertEquals(3, new Solution().climbStairs(3));
    }

    @Test
    void climbStairs13() {
        assertEquals(17711, new Solution().climbStairs(21));
    }

    @Test
    void climbStairs21() {
        assertEquals(2, new Solution().climbStairsBottomUp(2));
    }

    @Test
    void climbStairs22() {
        assertEquals(3, new Solution().climbStairsBottomUp(3));
    }

    @Test
    void climbStairs23() {
        assertEquals(17711, new Solution().climbStairsBottomUp(21));
    }

    // https://artofproblemsolving.com/wiki/index.php/Binet%27s_Formula
}