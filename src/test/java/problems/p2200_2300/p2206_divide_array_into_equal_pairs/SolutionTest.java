package problems.p2200_2300.p2206_divide_array_into_equal_pairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void divideArray() {
        assertEquals(true, new Solution().divideArray(new int[]{3,2,3,2,2,2}));
    }

    @Test
    void divideArrayNegative() {
        assertEquals(false, new Solution().divideArray(new int[]{1,2,3}));
        assertEquals(false, new Solution().divideArray(new int[]{1,2,3,4}));
        assertEquals(false, new Solution().divideArray(new int[]{15,13,5,20,18,2,20,8,20,17,10,19}));
    }

}