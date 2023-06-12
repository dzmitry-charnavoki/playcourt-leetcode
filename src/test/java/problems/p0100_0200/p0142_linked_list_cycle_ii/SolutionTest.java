package problems.p0100_0200.p0142_linked_list_cycle_ii;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void detectCycle1() {
        ListNode cn = ListNode.of(3, 2, 0, -4);
        cn.next.next.next.next = cn.next;
        assertEquals(2, new Solution().detectCycle(cn)
            .val);

    }

    @Test
    void detectCycle11() {
        ListNode cn = ListNode.of(3, 2, 0, -4);
        assertNull(new Solution().detectCycle(cn));
    }

    @Test
    void detectCycle12() {
        ListNode cn = ListNode.of(3, 2, 0, -4, 5);
        assertNull(new Solution().detectCycle(cn));
    }

    @Test
    void detectCycle2() {
        ListNode cn = ListNode.of(1, 2);
        cn.next.next = cn;
        assertEquals(1, new Solution().detectCycle(cn)
            .val);
    }

    @Test
    void detectCycle3() {
        ListNode cn = ListNode.of(1);
        assertNull(new Solution().detectCycle(cn));
    }
}