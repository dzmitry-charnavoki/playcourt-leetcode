package problems.p1800_1900.p1851_minimum_interval_to_include_each_query;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.fill(ans, -1);
        Comparator<Query> comparator = (o1, o2) -> o1.size - o2.size;
        Queue<Query> minHeap = new PriorityQueue<>(comparator);
        Integer[] indices = new Integer[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            indices[i] = i;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(indices, (a, b) -> queries[a] - queries[b]);

        int i = 0;
        for (final int index : indices) {
            while (i < intervals.length && intervals[i][0] <= queries[index]) {
                minHeap.offer(new Query(intervals[i][1] - intervals[i][0] + 1, intervals[i][1]));
                ++i;
            }
            while (!minHeap.isEmpty() && minHeap.peek().right < queries[index]) {
                minHeap.poll();
            }
            if (!minHeap.isEmpty()) {
                ans[index] = minHeap.peek().size;
            }
        }

        return ans;
    }

    static class Query {
        public int size;
        public int right;

        public Query(int size, int right) {
            this.size = size;
            this.right = right;
        }
    }
}
