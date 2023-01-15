package problems.p0000_0100.p0025_reverse_nodes_in_k_group;

import utils.ListNode;

class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        // this part to answer if enough elements for reverse
        // and condition to stop recursion
        int len = 0;
        ListNode tmpLen = head;
        while (len++ < k) {
            if (tmpLen == null) {
                return head;
            }
            tmpLen = tmpLen.next;
        }
        // end of checking length

        //current as the first node of group becomes further link in the chain
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        int i = 0;
        // Magic is here.
        // Instead of rotating Nodes around center need just to move node to the right K times.
        // (via swapping pairs)
        // Drawback is that it need to repeat K times,
        // But benefit is that we can use same signature of this method for recursive call.
        while (i != k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        head.next = reverseKGroup(next, k);
        return prev;
    }

}
