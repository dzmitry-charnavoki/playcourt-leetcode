package problems.p0000_0100.p0047_permutations_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // by sorting we may easily control usage of previous number
        backtrackDfs(nums, ans, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    private void backtrackDfs(int[] nums, List<List<Integer>> ans,
                              List<Integer> ds, boolean[] used) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]
                || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            ds.add(nums[i]);
            backtrackDfs(nums, ans, ds, used);
            ds.remove(ds.size() - 1);
            used[i] = false;
        }
    }
}
