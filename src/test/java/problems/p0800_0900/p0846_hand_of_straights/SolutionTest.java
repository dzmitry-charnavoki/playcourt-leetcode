package problems.p0800_0900.p0846_hand_of_straights;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isNStraightHand1() {
        assertTrue(new Solution().isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }

    @Test
    void isNStraightHand2() {
        assertFalse(new Solution().isNStraightHand(new int[]{1,2,3,4,5}, 4));
    }

    @Test
    void isNStraightHand3() {
        assertTrue(new Solution().isNStraightHand(new int[]{1,2,3,1,2,3, 6,2,3,4,7,8}, 3));
    }
}