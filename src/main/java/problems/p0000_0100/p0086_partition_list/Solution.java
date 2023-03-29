package problems.p0000_0100.p0086_partition_list;

import utils.ListNode;

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode leftHead = new ListNode();
        ListNode rightHead  = new ListNode();
        ListNode leftTail = leftHead;
        ListNode rightTail = rightHead;
        while (head != null) {
            if (head.val < x) {
                leftTail.next = head;
                leftTail = leftTail.next;
            } else {
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }

        rightTail.next = null;
        leftTail.next = rightHead.next;
        return leftHead.next;
    }
}
