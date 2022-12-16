package problems.p0000_0100.p0002_add_two_numbers;

import utils.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c = l1 != null ? l1 : l2;
        ListNode r = null;
        ListNode cr = null;
        int t = 0;
        while (c != null || t == 1) {
            c = l1 == null ? l2 : l1;

            if (t == 1 && c == null) {
                cr.next = new ListNode(1);
            }

            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int v = (v1 + v2 + t) % 10;
            t = v1 + v2 + t > 9 ? 1 : 0;

            if (r == null) {
                r = new ListNode(v);
                cr = r;
            } else {
                cr.next = new ListNode(v);
                cr = cr.next;
            }


            if (l1 != null) {
                l1 = l1.next != null ? l1.next : null;
            }
            if (l2 != null) {
                l2 = l2.next != null ? l2.next : null;
            }
            c = l1 != null ? l1 : l2;
        }

        return r;
    }
}
