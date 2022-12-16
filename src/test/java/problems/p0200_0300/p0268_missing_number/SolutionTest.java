package problems.p0200_0300.p0268_missing_number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void missingNumber21() {
        assertEquals(2, new Solution().missingNumberBitM(new int[]{3,0,1}));
    }

    @Test
    void missingNumber22() {
        assertEquals(2, new Solution().missingNumberBitM(new int[]{0,1}));
    }

    @Test
    void missingNumber23() {
        assertEquals(8, new Solution().missingNumberBitM(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    @Test
    void missingNumber24() {
        assertEquals(7, new Solution().missingNumberBitM(new int[]{6,8,9}));
    }

}
