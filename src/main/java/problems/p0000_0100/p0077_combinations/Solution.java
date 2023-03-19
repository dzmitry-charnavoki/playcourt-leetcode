package problems.p0000_0100.p0077_combinations;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(n, k, 1, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int n, int k, int s, List<Integer> combinations, List<List<Integer>> ans) {
        if (combinations.size() == k) {
            ans.add(new ArrayList<>(combinations));
            return;
        }

        for (int i = s; i <= n; ++i) {
            combinations.add(i);
            dfs(n, k, i + 1, combinations, ans);
            combinations.remove(combinations.size() - 1);
        }
    }
}
