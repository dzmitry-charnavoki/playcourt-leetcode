package problems.p0000_0100.p0005_longest_palindromic_substring;

class Solution {

    // https://ru.wikipedia.org/wiki/%D0%90%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC_%D0%9C%D0%B0%D0%BD%D0%B0%D0%BA%D0%B5%D1%80%D0%B0
    // https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%B8%D1%81%D0%BA_%D0%B4%D0%BB%D0%B8%D0%BD%D0%BD%D0%B5%D0%B9%D1%88%D0%B5%D0%B9_%D0%BF%D0%BE%D0%B4%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B8-%D0%BF%D0%B0%D0%BB%D0%B8%D0%BD%D0%B4%D1%80%D0%BE%D0%BC%D0%B0
    // https://neerc.ifmo.ru/wiki/index.php?title=%D0%90%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC_%D0%9C%D0%B0%D0%BD%D0%B0%D0%BA%D0%B5%D1%80%D0%B0
    // https://en.wikipedia.org/wiki/Longest_palindromic_substring#Manacher's_algorithm

    public String longestPalindrome(String s) {
        char[] newStr = manacherString(s);
        int[] dp = new int[newStr.length];
        int friendCenter = 0;
        int friendRadius = 0;
        int lpsCenter = 0;
        int lpsRadius = 0;
        for (int i = 0; i < newStr.length; i++) {
            dp[i] =
                friendCenter + friendRadius > i
                    ? Math.min(dp[friendCenter * 2 - i], friendCenter + friendRadius - i)
                    : 1;
            while (i + dp[i] < newStr.length
                && i - dp[i] >= 0
                && newStr[i + dp[i]] == newStr[i - dp[i]]) {
                dp[i]++;
            }
            if (friendCenter + friendRadius < i + dp[i]) {
                friendCenter = i;
                friendRadius = dp[i];
            }
            if (lpsRadius < dp[i]) {
                lpsCenter = i;
                lpsRadius = dp[i];
            }
        }
        return s.substring((lpsCenter - lpsRadius + 1) / 2, (lpsCenter + lpsRadius - 1) / 2);
    }

    public static char[] manacherString(String str) {
        char[] res = new char[str.length() * 2 + 1];
        int index = 0;
        for (int i = 0; i != res.length; i++) {
            res[i] = (i & 1) == 0 ? '#' : str.charAt(index++);
        }
        return res;
    }

}
