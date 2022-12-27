package problems.p0000_0100.p0003_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int max = 0;
        int st = 0;
        int end = 0;

        while(end < s.length()) {
            char c = s.charAt(end);
            if (chars.add(c)) {
                end++;
                max = Math.max(max, chars.size());
            } else {
                chars.remove(s.charAt(st));
                st++;
            }

        }
        return max;
    }
}
