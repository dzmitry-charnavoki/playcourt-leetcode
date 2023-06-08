package problems.p0700_0800.p0703_kth_largest_element_in_a_stream;

import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {

    private final Queue<Integer> minHeap;
    private final int kth;

    public KthLargest(int k, int[] nums) {
        this.kth = k;
        minHeap = new PriorityQueue();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        heapify(val);
        return minHeap.peek();
    }

    private void heapify(int val) {
        minHeap.offer(val);
        if (minHeap.size() > kth) {
            minHeap.poll();
        }
    }
}
