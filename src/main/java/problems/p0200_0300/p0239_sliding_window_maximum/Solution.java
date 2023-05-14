package problems.p0200_0300.p0239_sliding_window_maximum;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>(k); // Monotonic Queue

        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.pollLast(); // remove
            }
            queue.offerLast(nums[i]);

            if (i - k + 1 >= 0) {
                ans[i - k + 1] = queue.peekFirst();
            }

        }
        return ans;
    }
}
