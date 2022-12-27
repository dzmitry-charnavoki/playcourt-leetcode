package problems.p0000_0100.p0023_merge_k_sorted_lists;

import java.util.Comparator;
import java.util.PriorityQueue;
import utils.ListNode;

class Solution {

    /**
     * see the task 21 as prerequisite.
     * https://afteracademy.com/blog/merge-k-sorted-lists/
     * --------
     * https://favtutor.com/blogs/merge-k-sorted-lists
     * PriorityQueue 'pq' implemented as min heap
     */
    public ListNode mergeKofListsMinHeap(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }
        if (pq.isEmpty()) {
            return null;
        }

        //Creating dummy node with def val ( it does not matter since will be return next reference)
        ListNode dummy = new ListNode();
        ListNode last = dummy;

        //Run while loop till priorityQueue(pq) is not empty
        while (!pq.isEmpty()) {
            //Get the top element of 'pq'
            //which is the minimum of all existing nodes.
            ListNode curr = pq.remove();

            //Add top element of 'pq'
            // to the resultant merged list
            last.next = curr;
            last = last.next;


            // Check if there is a node
            // next to the 'top' node
            // in the list of which 'top'
            // node is a member
            if (curr.next != null) {
                pq.add(curr.next);
            }
        }
        //return the next of dummy node
        // which the actual head of merged list.
        return dummy.next;
    }
}
