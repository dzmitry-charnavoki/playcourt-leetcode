package problems.p0000_0100.p0092_reverse_linked_list_ii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void reverseBetween1() {
        assertEquals("1, 4, 3, 2, 5",
            new Solution().reverseBetween(ListNode.of(1, 2, 3, 4, 5), 2, 4).toString());
    }

    @Test
    void reverseBetween2() {
        assertEquals("5",
            new Solution().reverseBetween(ListNode.of(5), 1, 1).toString());
    }
}