package problems.p0000_0100.p0011_container_with_most_water;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxArea1() {
        assertEquals(49, new Solution().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    void maxArea2() {
        assertEquals(1, new Solution().maxArea(new int[]{1,1}));
    }

}