package problems.p0000_0100.p0086_partition_list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void partition1() {
        ListNode ln = ListNode.of(1, 4, 3, 2, 5, 2);
        assertEquals("1, 2, 2, 4, 3, 5", new Solution().partition(ln, 3).toString());
    }

    @Test
    void partition2() {
        ListNode ln = ListNode.of(2, 1);
        assertEquals("1, 2", new Solution().partition(ln, 2).toString());
    }

}