package problems.p0000_0100.p0082_remove_duplicates_from_sorted_list_ii;

import utils.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;

        while (right != null) {
            while (right.next != null && right.val == right.next.val) {
                right = right.next; // skipping
            }
            if (left.next == right) {
                left = left.next; // l++
            } else {
                left.next = right.next; // linkage
            }
            right = right.next; // r++
        }
        return dummy.next;
    }
}
