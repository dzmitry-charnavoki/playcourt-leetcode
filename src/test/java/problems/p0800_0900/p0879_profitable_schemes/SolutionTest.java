package problems.p0800_0900.p0879_profitable_schemes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void profitableSchemes1() {
        assertEquals(2, new Solution()
            .profitableSchemes(5, 3, new int[] {2, 2}, new int[] {2, 3}));
    }

    @Test
    void profitableSchemes2() {
        assertEquals(7, new Solution()
            .profitableSchemes(10, 5, new int[] {2, 2, 5}, new int[] {6, 7, 8}));
    }
}