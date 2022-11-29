package problems.p1400_1500.p1464_maximum_product_of_two_elements_in_an_array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxProduct() {
        assertEquals(36, new Solution().maxProduct(new int[] {10,2,5,2}));
        assertEquals(12, new Solution().maxProduct(new int[] {3,4,5,2}));
        assertEquals(16, new Solution().maxProduct(new int[] {1,5,4,5}));
        assertEquals(12, new Solution().maxProduct(new int[] {3,7}));
    }
}