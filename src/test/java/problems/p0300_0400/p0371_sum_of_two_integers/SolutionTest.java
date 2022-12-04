package problems.p0300_0400.p0371_sum_of_two_integers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void getSum1() {
        assertEquals(3, new Solution().getSum(1, 2));
    }

    @Test
    void getSum2() {
        assertEquals(5, new Solution().getSum(2, 3));
    }

    @Test
    void getSum3() {
        assertEquals(20, new Solution().getSum(11, 9));
    }
}