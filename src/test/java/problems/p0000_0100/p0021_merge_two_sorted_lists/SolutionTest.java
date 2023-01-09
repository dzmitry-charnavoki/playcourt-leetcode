package problems.p0000_0100.p0021_merge_two_sorted_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void mergeTwoLists21() {
        ListNode n1 = ListNode.of(1, 2, 4);
        ListNode n2 = ListNode.of(1, 3, 4);
        assertEquals("1, 1, 2, 3, 4, 4", new Solution().mergeTwoLists(n1, n2).toString());
    }

    @Test
    void mergeTwoLists22() {
        ListNode n1 = ListNode.of(1, 4);
        ListNode n2 = ListNode.of(2, 3, 5);
        assertEquals("1, 2, 3, 4, 5", new Solution().mergeTwoLists(n1, n2).toString());
    }

    @Test
    void mergeTwoLists23() {
        ListNode n1 = ListNode.of(2, 3, 5);
        ListNode n2 = ListNode.of(1, 4);
        assertEquals("1, 2, 3, 4, 5", new Solution().mergeTwoLists(n1, n2).toString());
    }

    @Test
    void mergeTwoLists24() {
        assertNull(new Solution().mergeTwoLists(null, null));
    }

    @Test
    void mergeTwoLists25() {
        ListNode n2 = ListNode.of(0);
        assertEquals("0", new Solution().mergeTwoLists(null, n2).toString());
    }

    @Test
    void mergeTwoLists26() {
        ListNode n2 = ListNode.of(0);
        assertEquals("0", new Solution().mergeTwoLists(n2, null).toString());
    }

    // --------------------

    @Test
    void mergeTwoLists11() {
        ListNode n1 = ListNode.of(1, 2, 4);
        ListNode n2 = ListNode.of(1, 3, 4);
        assertEquals("1, 1, 2, 3, 4, 4", new Solution().mergeTwoListsLoop(n1, n2).toString());
    }

    @Test
    void mergeTwoLists12() {
        ListNode n1 = ListNode.of(1, 4);
        ListNode n2 = ListNode.of(2, 3, 5);
        assertEquals("1, 2, 3, 4, 5", new Solution().mergeTwoListsLoop(n1, n2).toString());
    }

    @Test
    void mergeTwoLists13() {
        ListNode n1 = ListNode.of(2, 3, 5);
        ListNode n2 = ListNode.of(1, 4);
        assertEquals("1, 2, 3, 4, 5", new Solution().mergeTwoListsLoop(n1, n2).toString());
    }

    @Test
    void mergeTwoLists14() {
        assertNull(new Solution().mergeTwoListsLoop(null, null));
    }

    @Test
    void mergeTwoLists15() {
        ListNode n2 = ListNode.of(0);
        assertEquals("0", new Solution().mergeTwoListsLoop(null, n2).toString());
    }

}