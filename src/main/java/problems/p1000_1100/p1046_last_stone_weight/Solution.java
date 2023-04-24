package problems.p1000_1100.p1046_last_stone_weight;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }
        while (pq.size() >= 2) {
            int f = pq.poll();
            int s = pq.poll();
            pq.add(Math.abs(f - s));
        }
        return pq.peek();
    }
}
