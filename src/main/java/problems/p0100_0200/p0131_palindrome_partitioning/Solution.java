package problems.p0100_0200.p0131_palindrome_partitioning;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        dfs(s, 0, ans, new ArrayList<>());
        return ans;
    }

    private void dfs(String s, int start, List<List<String>> ans, List<String> tmp) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                tmp.add(s.substring(start, i + 1));
                dfs(s, i + 1, ans, tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
