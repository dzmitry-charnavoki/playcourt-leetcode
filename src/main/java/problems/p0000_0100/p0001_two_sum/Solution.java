package problems.p0000_0100.p0001_two_sum;

import java.util.Hashtable;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> htNumsToIndex = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            if (htNumsToIndex.containsKey(target - nums[i])) {
                return new int[] {htNumsToIndex.get(target - nums[i]), i};
            }
            htNumsToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
