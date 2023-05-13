package problems.p0400_0500.p0424_longest_repeating_character_replacement;

class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == k) {
            return k;
        }
        int[] count = new int[128];
        int res = 0;
        int maxf = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            int ri = s.charAt(r);
            count[ri]++;
            maxf = Math.max(maxf, count[ri]);
            while (r - l + 1 - maxf > k) {
                count[s.charAt(l++)]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
