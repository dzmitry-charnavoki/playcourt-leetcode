package problems.p1400_1500.p1456_maximum_number_of_vowels_in_a_substring_of_given_length;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int res = 0;
        int count = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (vowels.contains(c)) {
                count++;
            }
            if (r - l >= k) {
                if (vowels.contains(s.charAt(l))) {
                    count--;
                }
                l++;
            }
            res = Math.max(res, count);
        }

        return res;
    }

}
