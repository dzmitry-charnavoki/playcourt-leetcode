package problems.p0100_0200.p0190_reverse_bits;

class Solution {
    // you need treat n as an unsigned value
    // -> we use 32 as amount of times to shift
    public int reverseBits(int n) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
            r <<= 1;
            r |= n & 0b1;
            n >>= 1;
        }
        return r;
    }

}
