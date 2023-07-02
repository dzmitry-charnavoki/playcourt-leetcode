package problems.p0100_0200.p0139_word_break;

import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;


        for (int i = s.length() - 1; i >= 0; i--) {
            for (String word : wordDict) {
                if ((i + word.length()) <= s.length()
                    && wordDict.contains(s.substring(i, i + word.length()))) {
                    dp[i] = dp[i + word.length()];
                }
                if (dp[i]) {
                    break;
                }
            }

        }

        return dp[0];
    }
}
