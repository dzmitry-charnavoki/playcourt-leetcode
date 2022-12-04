package problems.p0700_0800.p0771_jewels_and_stones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numJewelsInStones() {
        assertEquals(3, new Solution().numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, new Solution().numJewelsInStones("z", "ZZ"));
    }

    @Test
    void numJewelsInStonesBM() {
        assertEquals(4, new Solution().numJewelsInStonesBitM("zZ", "ZZAAbbbbzz"));
        assertEquals(3, new Solution().numJewelsInStonesBitM("aA", "aAAbbbb"));
        assertEquals(0, new Solution().numJewelsInStonesBitM("z", "ZZ"));
    }

    @Test
    void numJewelsInStonesHS() {
        assertEquals(3, new Solution().numJewelsInStonesHashSet("aA", "aAAbbbb"));
        assertEquals(0, new Solution().numJewelsInStonesHashSet("z", "ZZ"));
    }

}