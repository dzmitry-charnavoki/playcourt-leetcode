package problems.p0000_0100.p0021_merge_two_sorted_lists;

import utils.ListNode;

class Solution {

    // 1, 4
    // 2,3,5
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        if (list1.val > list2.val) {
            ListNode tmp = list2;
            list2 = list1;
            list1 = tmp;
        }
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    }


    public ListNode mergeTwoListsLoop(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode r = new ListNode();
        ListNode p = r;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    p.next = list2;
                    list2 = list2.next;
                } else {
                    p.next = list1;
                    list1 = list1.next;
                }
            } else if (list1 != null) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        return r.next;
    }
}
