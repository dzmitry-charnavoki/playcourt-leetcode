package problems.p0100_0200.p0190_reverse_bits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reverseBits1() {
        assertEquals(0b00111001011110000010100101000000, new Solution()
            .reverseBits(0b00000010100101000001111010011100));
    }

    @Test
    void reverseBits2() {
        assertEquals(0b10111111111111111111111111111111, new Solution()
            .reverseBits(0b11111111111111111111111111111101));
    }

}