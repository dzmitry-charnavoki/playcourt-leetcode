package problems.p0000_0100.p0072_edit_distance;

class Solution {
    public int minDistance(String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }
        if ("".equals(word1)) {
            return word2.length();
        }
        if ("".equals(word2)) {
            return word1.length();
        }

        int[][] memo = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i < word2.length(); i++) {
            memo[word1.length()][i] = word2.length() - i;
        }

        for (int i = 0; i < word1.length(); i++) {
            memo[i][word2.length()] = word1.length() - i;
        }

        for (int i = word1.length() - 1; i >= 0; i--) {
            for (int j = word2.length() - 1; j >= 0; j--) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    memo[i][j] = memo[i + 1][j + 1];
                } else {
                    // memo[i][j+1] - insert
                    // memo[i + 1][j] - delete
                    // memo[i + 1][j+1] - replace
                    memo[i][j] =
                        1 + Math.min(memo[i + 1][j], Math.min(memo[i][j + 1], memo[i + 1][j + 1]));
                }
            }
        }

        return memo[0][0];
    }
}
