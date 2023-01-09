package problems.p0000_0100.p0022_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        generateParenthesis(combinations, new StringBuilder(), 0, 0, n);
        return combinations;
    }

    public void generateParenthesis(List<String> combinations, StringBuilder cur,
                                    int open, int close, int n) {
        if (open == n && close == n) {
            combinations.add(cur.toString());
            return;
        }
        if (open < n) {
            generateParenthesis(combinations, cur.append('('), open + 1, close, n);
            cur.deleteCharAt(cur.length() - 1);
        }

        if (close < open) {
            generateParenthesis(combinations, cur.append(')'), open, close + 1, n);
            cur.deleteCharAt(cur.length() - 1);
        }

    }

}
