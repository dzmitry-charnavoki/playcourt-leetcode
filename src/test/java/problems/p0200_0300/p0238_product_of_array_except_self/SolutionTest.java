package problems.p0200_0300.p0238_product_of_array_except_self;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void productExceptSelf11() {
        assertArrayEquals(new int[]{24,12,8,6}, new Solution().productExceptSelfSuffixAsArray(new int[]{1,2,3,4}));
    }

    @Test
    void productExceptSelf12() {
        assertArrayEquals(new int[]{0,0,9,0,0}, new Solution().productExceptSelfSuffixAsArray(new int[]{-1,1,0,-3,3}));
    }

    // https://www.enjoyalgorithms.com/blog/product-of-array-except-self
    @Test
    void productExceptSelf21() {
        assertArrayEquals(new int[]{24,12,8,6}, new Solution().productExceptSelfPrefixAsArray(new int[]{1,2,3,4}));
    }

    @Test
    void productExceptSelf22() {
        assertArrayEquals(new int[]{0,0,9,0,0}, new Solution().productExceptSelfPrefixAsArray(new int[]{-1,1,0,-3,3}));
    }

}