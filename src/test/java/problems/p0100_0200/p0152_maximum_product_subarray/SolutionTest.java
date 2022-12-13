package problems.p0100_0200.p0152_maximum_product_subarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxProduct11() {
        assertEquals(6, new Solution().maxProduct(new int[] {2,3,-2,4}));
    }

    @Test
    void maxProduct12() {
        assertEquals(0, new Solution().maxProduct(new int[] {-2,0,-1}));
    }
    @Test
    void maxProduct13() {
        assertEquals(30, new Solution().maxProduct(new int[] {9, -6, 10, 3}));
    }

    @Test
    void maxProduct14() {
        assertEquals(180, new Solution().maxProduct(new int[] {6, -3, -10, 0, 2}));
    }

    @Test
    void maxProduct15() {
        assertEquals(80, new Solution().maxProduct(new int[] {-2, -3, 0, -2, -40}));
    }
}