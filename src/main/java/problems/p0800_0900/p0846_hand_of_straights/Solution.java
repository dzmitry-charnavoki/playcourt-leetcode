package problems.p0800_0900.p0846_hand_of_straights;

import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (final int card : hand) {
            count.merge(card, 1, Integer::sum);
        }
        for (final int startPos : count.keySet()) {
            final int value = count.getOrDefault(startPos, 0);
            if (value > 0) {
                for (int i = startPos; i < startPos + groupSize; i++) {
                    if (count.merge(i, -value, Integer::sum) < 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
