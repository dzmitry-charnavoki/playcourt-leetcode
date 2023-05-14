package problems.p0500_0600.p0567_permutation_in_string;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int matches = s1.length();

        for (int r = 0; r < s2.length(); r++) {
            if (--freq[s2.charAt(r) - 'a'] >= 0) {
                matches--;
            }
            if (r >= s1.length() && ++freq[s2.charAt(r - s1.length()) - 'a'] > 0) {
                matches++;
            }
            if (matches == 0) {
                return true;
            }
        }
        return false;
    }

}
