package problems.p0700_0800.p0771_jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numJewelsInStonesHashSet(String jewels, String stones) {
        Set<Character> hs = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            hs.add(jewel);
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (hs.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    /**
     * https://www.geeksforgeeks.org/check-whether-k-th-bit-set-not/
     * https://www.baeldung.com/java-bitmasking
     * 'A' to use as 0 for range [A-z] : https://www.asciitable.com/
     * int that case 122(z)-65(A) = 57
     * if to use 57 as bits it's < 8 bytes = long type fit to it.
     * as alternative BitSet bs = new BitSet(); can be used
     */
    public int numJewelsInStonesBitM(String jewels, String stones) {
        long hs = 0;
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            long asciIndex = jewels.charAt(i) - 'A';
            long curBit = 1L << asciIndex;
            hs |= curBit;
        }
        for (int i = 0; i < stones.length(); i++) {
            long asciIndex = stones.charAt(i) - 'A';
            long curBit = 1L << asciIndex;
            if ((hs & curBit) == curBit) {
                count++;
            }
        }
        return count;
    }

}
