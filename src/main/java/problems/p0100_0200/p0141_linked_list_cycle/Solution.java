package problems.p0100_0200.p0141_linked_list_cycle;

import java.util.HashSet;
import java.util.Set;
import utils.ListNode;

class Solution {

    //Floyd’s Cycle Detection Algorithm
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    // HashSet
    public boolean hasCycleSet(ListNode head) {
        Set<ListNode> mp = new HashSet<>();
        while (head != null) {
            if (mp.contains(head)) {
                return true;
            }
            mp.add(head);
            head = head.next;
        }
        return false;
    }
}
