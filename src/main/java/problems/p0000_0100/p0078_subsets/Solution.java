package problems.p0000_0100.p0078_subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void dfs(int[] nums, List<List<Integer>> ans, List<Integer> tmp, int i) {
        if (i >= nums.length) {
            ans.add(new ArrayList<Integer>(tmp));
            return;
        }
        tmp.add(nums[i]);
        dfs(nums, ans, tmp, i + 1);
        tmp.remove(tmp.size() - 1);
        dfs(nums, ans, tmp, i + 1);

    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int count = 1 << nums.length; // 2 ^ n.length

        for (int i = 0; i < count; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) > 0) {
                    tmp.add(nums[j]);
                }
            }
            ans.add(new ArrayList<>(tmp));
        }

        return ans;
    }


}
