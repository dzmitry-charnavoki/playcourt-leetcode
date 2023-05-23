package problems.p0100_0200.p0143_reorder_list;

import utils.ListNode;

class Solution {
    private ListNode cursor;

    public void reorderList(ListNode head) {
        cursor = head;
        dfs(head);
    }

    private void dfs(ListNode node) {
        if (node != null) {
            dfs(node.next);
            if (cursor != null) {
                ListNode next = cursor.next;
                // even case: forward.next coincide with node
                if (next == node) {
                    node.next = null;
                } else {
                    node.next = next;
                }
                cursor.next = node;
                cursor = node.next;
            }
            // odd case: forward coincide with node
            if (cursor == node) {
                cursor.next = null;
                cursor = cursor.next;
            }
        }
    }
}
