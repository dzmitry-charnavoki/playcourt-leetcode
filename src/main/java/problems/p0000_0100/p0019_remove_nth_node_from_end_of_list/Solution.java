package problems.p0000_0100.p0019_remove_nth_node_from_end_of_list;

import java.util.concurrent.atomic.AtomicInteger;
import utils.ListNode;

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0, head);
        removeNthFromEnd(node, new AtomicInteger(n));
        return node.next;
    }

    public void removeNthFromEnd(ListNode cur, AtomicInteger c) {
        if (cur.next == null) {
            return;
        }
        removeNthFromEnd(cur.next, c);
        if (c.decrementAndGet() == 0) {
            cur.next = cur.next.next;
        }
    }


}
