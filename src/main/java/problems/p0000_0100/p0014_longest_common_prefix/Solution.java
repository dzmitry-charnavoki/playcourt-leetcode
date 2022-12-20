package problems.p0000_0100.p0014_longest_common_prefix;

class Solution {
    // https://en.wikipedia.org/wiki/LCP_array
    // https://afteracademy.com/blog/longest-common-prefix/
    // https://www.interviewbit.com/blog/longest-common-prefix/
    // clarification: in this task we consider prefix from the beginning of a string
    // Vertical Scanning
    // flower
    // flow
    // flight
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1 || strs[0].length() == 0) {
            return strs[0];
        }
        char c;
        for (int i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}
