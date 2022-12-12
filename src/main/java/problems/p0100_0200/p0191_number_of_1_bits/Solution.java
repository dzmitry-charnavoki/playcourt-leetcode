package problems.p0100_0200.p0191_number_of_1_bits;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        while (mask <= 32) {
            if ((n & 1) == 1) {
                count++;
            }
            mask++;
            n >>= 1;
        }
        return count;
    }

    public int hammingWeightToBinString(int n) {
        return Collections.frequency(
            Arrays.stream(Integer.toBinaryString(n).split("")).collect(Collectors.toList()), "1");
    }

    public int hammingWeightLanguageFeature(int n) {
        return Integer.bitCount(n);
    }
}
