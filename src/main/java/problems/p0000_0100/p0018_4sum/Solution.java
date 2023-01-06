package problems.p0000_0100.p0018_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return ans;
        }
        Arrays.sort(nums);
        int n = nums.length;
        long sum;
        int l;
        int r;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]
                ) {
                    continue;
                }
                l = j + 1;
                r = n - 1;
                while (l < r) {
                    sum = (long) nums[i] + (long) nums[j] + (long) nums[l] + (long) nums[r];
                    if (sum == target) {
                        ans.add(List.of(nums[i], nums[j], nums[l], nums[r]));
                        while (l + 1 < r && nums[l + 1] == nums[l]) {
                            l++;
                        }
                        while (r - 1 > l && nums[r - 1] == nums[r]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}
