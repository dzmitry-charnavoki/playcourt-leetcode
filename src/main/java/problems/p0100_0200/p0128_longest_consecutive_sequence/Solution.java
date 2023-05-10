package problems.p0100_0200.p0128_longest_consecutive_sequence;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int length = 0;
                while (set.contains(num + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
