package problems.p0000_0100.p0061_rotate_list;

import utils.ListNode;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int count = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            count++;
        }
        tail.next = head; // create a ring

        int times = count - k % count; //amount of times to rotate forward
        for (int i = 0; i < times; ++i) {
            tail = tail.next;
        }
        ListNode newHead = tail.next;
        tail.next = null;
        return newHead;
    }
}
