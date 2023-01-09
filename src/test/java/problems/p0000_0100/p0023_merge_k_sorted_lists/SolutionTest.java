package problems.p0000_0100.p0023_merge_k_sorted_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void mergeKLists_n1() {
        assertNull(new Solution().mergeKofListsMinHeap(new ListNode[] {null, null}));
    }

    @Test
    void mergeKLists1() {
        ListNode n1 = ListNode.of(1, 4, 5);
        ListNode n2 = ListNode.of(1, 3, 4);
        ListNode n3 = ListNode.of(2, 6);

        assertEquals("1, 1, 2, 3, 4, 4, 5, 6",
            new Solution().mergeKofListsMinHeap(new ListNode[] {n1, n2, n3}).toString());
    }

    @Test
    void mergeKLists2() {
        ListNode n1 = ListNode.of(1, 3, 5, 7, 11);
        ListNode n2 = ListNode.of(2, 8, 12);
        ListNode n3 = ListNode.of(4, 6, 9, 10);

        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12",
            new Solution().mergeKofListsMinHeap(new ListNode[] {n1, n2, n3}).toString());
    }


}