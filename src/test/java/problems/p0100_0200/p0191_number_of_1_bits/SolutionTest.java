package problems.p0100_0200.p0191_number_of_1_bits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void hammingWeight1() {
        assertEquals(3,
            new Solution().hammingWeight(0b00000000000000000000000000001011));
    }

    @Test
    void hammingWeight2() {
        assertEquals(1,
            new Solution().hammingWeight(0b00000000000000000000000010000000));
    }

    @Test
    void hammingWeight3() {
        assertEquals(31,
            new Solution().hammingWeight(0b11111111111111111111111111111101));
    }

    @Test
    void hammingWeightToBinString() {
        assertEquals(3,
            new Solution().hammingWeightToBinString(0b00000000000000000000000000001011));
        assertEquals(31,
            new Solution().hammingWeightToBinString(0b11111111111111111111111111111101));
    }

    @Test
    void hammingWeightLanguageFeature() {
        assertEquals(3,
            new Solution().hammingWeightLanguageFeature(0b00000000000000000000000000001011));
        assertEquals(31,
            new Solution().hammingWeightLanguageFeature(0b11111111111111111111111111111101));
    }
}