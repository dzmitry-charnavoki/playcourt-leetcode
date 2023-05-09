package problems.p0300_0400.p0347_top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Queue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>(k, (o1, o2) -> o2.getValue() - o1.getValue());

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        pq.addAll(frequencyMap.entrySet());

        int[] result = new int[k];
        int i = 0;
        while (i < k) {
            result[i++] = pq.poll().getKey();
        }
        return result;
    }
}