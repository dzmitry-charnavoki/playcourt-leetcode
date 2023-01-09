package problems.p0000_0100.p0024_swap_nodes_in_pairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void swapPairs1() {
        assertEquals("2, 1, 4, 3", new Solution()
            .swapPairs(
                ListNode
                    .of(1, 2, 3, 4)).toString());
    }

    @Test
    void swapPairs2() {
        assertEquals("1", new Solution()
            .swapPairs(
                ListNode
                    .of(1)).toString());
    }

    @Test
    void swapPairs3() {
        assertEquals("2, 1, 3", new Solution()
            .swapPairs(
                ListNode
                    .of(1, 2, 3)).toString());
    }

    @Test
    void swapPairs4() {
        assertEquals("2, 1, 4, 3, 5", new Solution()
            .swapPairs(
                ListNode
                    .of(1, 2, 3, 4, 5)).toString());
    }
    @Test
    void swapPairs_n1() {
        assertNull(new Solution()
            .swapPairs(
                ListNode
                    .of()));
    }
}