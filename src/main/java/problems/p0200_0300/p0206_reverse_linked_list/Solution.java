package problems.p0200_0300.p0206_reverse_linked_list;

import utils.ListNode;

class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     *  1
     *  ─►2
     *    ─►3
     *      ─►4
     *        ─►5
     *   ┌─────────┐
     *   │1   2   3▼
     *  prev head next
     *   ▲         │
     *   └─────────┘
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode detached = null;
        while (head != null) {
            detached = head.next;
            head.next = prev;
            prev = head;
            head = detached;
        }
        return prev;
    }
}
