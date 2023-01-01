package problems.p0000_0100.p0010_regular_expression_matching;

class Solution {
    public boolean isMatchBottomUp(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--) {
            for (int j = pattern.length() - 1; j >= 0; j--) {
                boolean firstMatch = (i < text.length()
                    && (pattern.charAt(j) == text.charAt(i)
                    || pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || firstMatch && dp[i + 1][j];
                } else {
                    dp[i][j] = firstMatch && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }

    public boolean isMatchRecursion(String s, String p) {
        if ("".equals(p)) {
            return "".equals(s);
        }
        boolean first = !"".equals(s) && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatchRecursion(s, p.substring(2))
                || (first && isMatchRecursion(s.substring(1), p));
        } else {
            return first && isMatchRecursion(s.substring(1), p.substring(1));
        }
    }
}
