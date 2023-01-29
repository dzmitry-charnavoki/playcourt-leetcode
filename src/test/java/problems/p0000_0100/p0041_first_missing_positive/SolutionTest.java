package problems.p0000_0100.p0041_first_missing_positive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void firstMissingPositive1() {
        assertEquals(3, new Solution().firstMissingPositive(new int[] {1, 2, 0}));
    }

    @Test
    void firstMissingPositive2() {
        assertEquals(2, new Solution().firstMissingPositive(new int[] {3,4,-1,1}));
    }

    @Test
    void firstMissingPositive3() {
        assertEquals(1, new Solution().firstMissingPositive(new int[] {7,8,9,11,12}));
    }
    @Test
    void firstMissingPositive4() {
        assertEquals(3, new Solution().firstMissingPositive(new int[] {2, -9, 5, 11, 1, -10, 7}));
    }
    @Test
    void firstMissingPositive5() {
        assertEquals(8, new Solution().firstMissingPositive(new int[] {2, 3, 7, 5, 1, 6, 4}));
    }

}