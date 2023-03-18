package problems.p0000_0100.p0077_combinations;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(n, k, 1, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int n, int k, int s, List<Integer> path, List<List<Integer>> ans) {
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = s; i <= n; ++i) {
            path.add(i);
            dfs(n, k, i + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }
}
