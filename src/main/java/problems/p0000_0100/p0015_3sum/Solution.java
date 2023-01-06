package problems.p0000_0100.p0015_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (nums[l] + nums[r] == -nums[i]) {
                    List<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[l]);
                    t.add(nums[r]);

                    ans.add(t);

                    while (l + 1 < r && nums[l + 1] == nums[l]) {
                        l++;
                    }
                    while (r - 1 > l && nums[r - 1] == nums[r]) {
                        r--;
                    }

                    l++;
                    r--;
                } else if (nums[l] + nums[r] < -nums[i]) {
                    l++;
                } else {
                    r--;
                }
            }

            while (i + 1 < n && nums[i + 1] == nums[i]) {
                i++;
            }
        }
        return ans;
    }
}
