package problems.p0000_0100.p0092_reverse_linked_list_ii;

import utils.ListNode;

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode lp = dummy;
        ListNode cur = head;
        ListNode prev = null;
        int count = 0;
        while (cur != null) {
            if (++count < left) {
                lp = cur;
                cur = cur.next;
                continue;
            }
            if (count > right) {
                break;
            } else {
                ListNode tmpNext = cur.next;
                cur.next = prev;
                prev = cur;
                cur = tmpNext;
            }
        }
        lp.next.next = cur;
        lp.next = prev;
        return dummy.next;
    }
}
