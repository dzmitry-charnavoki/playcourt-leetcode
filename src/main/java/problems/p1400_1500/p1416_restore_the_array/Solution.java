package problems.p1400_1500.p1416_restore_the_array;

class Solution {
    public int numberOfArrays(String s, int k) {
        int aMod = 1_000_000_007; // constrain

        // dp[i] consist amount of possible arrays that may be created from s[0:i]
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            }
            long num = 0;
            for (int j = i; j < s.length(); j++) {
                num = num * 10 + s.charAt(j) - '0';
                if (num > k) {
                    break;
                }
                dp[i] = (dp[i] + dp[j + 1]) % aMod;
            }
        }
        return dp[0];
    }

}
