package problems.p0000_0100.p0024_swap_nodes_in_pairs;

import utils.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode holder = new ListNode(0, head);
        holder.next = head;

        ListNode current = holder;
        ListNode first = null;
        ListNode second = null;

        while (current.next != null && current.next.next != null) {
            first = current.next; // save ref first
            second = current.next.next; // save ref second
            //1, 2, 3, 4
            first.next = second.next; // redefine branch from second
            current.next = second; // move second left
            current.next.next = first; // move first right

            current = current.next.next; // next loop
        }

        return holder.next;
    }
}
