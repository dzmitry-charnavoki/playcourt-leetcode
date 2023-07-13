package problems.p0100_0200.p0134_gas_station;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canCompleteCircuit1() {
        assertEquals(3, new Solution().canCompleteCircuit(new int[] {1, 2, 3, 4, 5},
            new int[] {3, 4, 5, 1, 2}));
    }

    @Test
    void canCompleteCircuit3() {
        assertEquals(4, new Solution().canCompleteCircuit(new int[] {5, 1, 2, 3, 4},
            new int[] {4, 4, 1, 5, 1}));
    }

    @Test
    void canCompleteCircuit2() {
        assertEquals(-1, new Solution().canCompleteCircuit(new int[] {2, 3, 4},
            new int[] {3, 4, 3}));
    }

}