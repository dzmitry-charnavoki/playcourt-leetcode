package problems.p0200_0300.p0287_find_the_duplicate_number;

import java.util.BitSet;

class Solution {

    /*
    Linked List Cycle problem
    Floyd's alg - `Floyd's Tortoise and Hare` https://en.wikipedia.org/wiki/Cycle_detection
     */
    public int findDuplicate(int[] nums) {
        int slow = 0;
            {
            int fast = 0; // 2 steps from slow
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);
            }

        int slow2 = 0;

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;
    }

    /*
     How can we prove that at least one duplicate number must exist in nums?
     the Pigeonhole Principle - Принцип Дирихле (Принцип Голубятни).
     */
    public int findDuplicatePigeonhole(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (visited[nums[i]]) {
                return nums[i];
            }
            visited[nums[i]] = true;
        }

        return -1;
    }

    public int findDuplicateBitSet(int[] nums) {
        BitSet bitSet = new BitSet(nums.length);

        for (int num : nums) {
            if (bitSet.get(num)) {
                return num;
            }
            bitSet.set(num);
        }

        return -1;
    }


}
