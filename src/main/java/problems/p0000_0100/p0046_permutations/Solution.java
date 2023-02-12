package problems.p0000_0100.p0046_permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }

    private void backtrack(int[] nums, List<List<Integer>> ans,
                           List<Integer> ds, boolean[] used) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                ds.add(nums[i]);
                backtrack(nums, ans, ds, used);
                ds.remove(ds.size() - 1);
                used[i] = false;
            }
        }
    }



    /*
    Backtracking and DFS
    The implementation of the state transfer we can use either BFS or DFS on the implicit vertices.
    DFS is preferred because theoretically it took O(log n!) space used by stack,
    while if use BFS, the number of vertices saved in the queue can be close to n!.
    With recursive DFS, we can start from node [], and traverse to [1,2], then [1,2,3].
    Then we backtrack to [1,2], backtrack to [1], and go to [1, 3], to [1, 3, 2].
    To clear the relation between backtracking and DFS,
    we can say backtracking is a complete search technique and DFS is an ideal way to implement it.
     */
}
