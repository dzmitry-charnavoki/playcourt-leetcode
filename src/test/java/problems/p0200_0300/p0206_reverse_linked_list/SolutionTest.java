package problems.p0200_0300.p0206_reverse_linked_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utils.ListNode;

class SolutionTest {

    @Test
    void reverseList() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertEquals("5, 4, 3, 2, 1", new Solution().reverseList(node).toString());
    }

    @Test
    void reverseList2() {
        ListNode node = new ListNode(1, new ListNode(2));
        assertEquals("2, 1", new Solution().reverseList(node).toString());
    }

    @Test
    void reverseList3() {
        assertNull(new Solution().reverseList(null));
    }

}