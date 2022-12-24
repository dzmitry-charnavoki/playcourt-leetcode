package problems.p0100_0200.p0141_linked_list_cycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.DataGenerator;
import utils.ListNode;

class SolutionTest {

    @Test
    void hasCycle10() {
        assertFalse(new Solution().hasCycle(DataGenerator.createObj(3,2,-4)));
    }

    @Test
    void hasCycle11() {
        ListNode n = DataGenerator.createObj(3,2,0,-4);
        n.next.next.next.next = n.next;
        assertTrue(new Solution().hasCycle(n));
    }

    @Test
    void hasCycle12() {
        ListNode n = DataGenerator.createObj(1,2);
        n.next.next = n.next;
        assertTrue(new Solution().hasCycle(n));
    }

    @Test
    void hasCycle13() {
        assertFalse(new Solution().hasCycle(null));
    }

    @Test
    void hasCycle14() {
        ListNode n = DataGenerator.createObj(1,2);
        assertFalse(new Solution().hasCycle(n));
    }

    // ---------------------------

    @Test
    void hasCycle21() {
        ListNode n = DataGenerator.createObj(3,2,0,-4);
        n.next.next.next.next = n.next;
        assertTrue(new Solution().hasCycleSet(n));
    }

    @Test
    void hasCycle23() {
        ListNode n = DataGenerator.createObj(1,2);
        n.next.next = n.next;
        assertTrue(new Solution().hasCycleSet(n));
    }

    @Test
    void hasCycle24() {
        assertFalse(new Solution().hasCycleSet(null));
    }

}