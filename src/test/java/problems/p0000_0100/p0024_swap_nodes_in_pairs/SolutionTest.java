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

    // https://www.enjoyalgorithms.com/blog/swap-list-nodes-in-pairs
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode left = head;
        ListNode right = head.next;

        left.next = swapPairs(right.next);
        right.next = left;

        return right;
    }

    @Test
    void swapPairs_alternative() {
        assertEquals("2, 1, 4, 3",
            swapPairs(
                ListNode
                    .of(1, 2, 3, 4)).toString());
    }
}