package problems.p0900_1000.p0973_k_closest_points_to_origin;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[][] kthClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> distance(b) - distance(a));

        for (int[] point : points) {
            minHeap.offer(point);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (k > 0) {
            ans[--k] = minHeap.poll();
        }

        return ans;
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

}
