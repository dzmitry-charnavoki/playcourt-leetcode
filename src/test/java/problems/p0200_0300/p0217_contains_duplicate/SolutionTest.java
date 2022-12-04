package problems.p0200_0300.p0217_contains_duplicate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void containsDuplicate1() {
        assertTrue(new Solution().containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    void containsDuplicate2() {
        assertFalse(new Solution().containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    void containsDuplicate3() {
        assertTrue(new Solution().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

}