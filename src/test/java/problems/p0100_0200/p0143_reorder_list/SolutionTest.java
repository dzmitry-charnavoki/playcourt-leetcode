package problems.p0100_0200.p0143_reorder_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void reorderList1() {
        ListNode ln = ListNode.of(1, 2, 3, 4);
        new Solution().reorderList(ln);
        assertEquals("1, 4, 2, 3", ln.toString());
    }

    @Test
    void reorderList2() {
        ListNode ln = ListNode.of(1, 2, 3, 4, 5);
        new Solution().reorderList(ln);
        assertEquals("1, 5, 2, 4, 3", ln.toString());
    }

}