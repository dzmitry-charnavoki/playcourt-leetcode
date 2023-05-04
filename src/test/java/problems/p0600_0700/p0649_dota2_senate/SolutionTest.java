package problems.p0600_0700.p0649_dota2_senate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {


    @Test
    void predictPartyVictory1() {
        assertEquals("Radiant", new Solution().predictPartyVictory("RD"));
    }

    @Test
    void predictPartyVictory2() {
        assertEquals("Dire", new Solution().predictPartyVictory("RDD"));
    }


}