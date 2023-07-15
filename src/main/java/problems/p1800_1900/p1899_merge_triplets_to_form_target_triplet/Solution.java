package problems.p1800_1900.p1899_merge_triplets_to_form_target_triplet;

import java.util.Arrays;

class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] merged = new int[target.length];

        loop:
        for (int[] triplet : triplets) {
            for (int i = 0; i < target.length; i++) {
                if (triplet[i] > target[i]) {
                    continue loop;
                }
            }
            for (int i = 0; i < target.length; i++) {
                merged[i] = Math.max(merged[i], triplet[i]);
            }
        }

        return Arrays.equals(target, merged);
    }
}
