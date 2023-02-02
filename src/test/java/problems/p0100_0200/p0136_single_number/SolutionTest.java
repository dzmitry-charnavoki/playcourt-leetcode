package problems.p0100_0200.p0136_single_number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void singleNumber1() {
        assertEquals(1, new Solution().singleNumber(new int[] {2, 2, 1}));
    }

    @Test
    void singleNumber2() {
        assertEquals(4, new Solution().singleNumber(new int[] {4, 1, 2, 1, 2}));
    }

    @Test
    void singleNumber3() {
        assertEquals(1, new Solution().singleNumber(new int[] {1}));
    }
}