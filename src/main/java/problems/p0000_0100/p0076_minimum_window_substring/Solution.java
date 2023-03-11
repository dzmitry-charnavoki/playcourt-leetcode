package problems.p0000_0100.p0076_minimum_window_substring;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }
        // see ASCII - Binary Character Table
        // can be used as new int[122+1]; [A65 : z:122]
        // we reduced to 52 (26*2) if added normalization ( s.charAt(_) - 'A')
        int[] countT = new int[52 + 6 + 1];

        for (char c : t.toCharArray()) {
            countT[c - 'A']++;
        }

        int need = 0;
        int[] res = new int[2];
        int resLen = Integer.MAX_VALUE;

        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (countT[c - 'A']-- > 0) { // we use zero as comparison element
                need++;
            }
            while (need == t.length()) {
                if (r - l + 1 < resLen) {
                    res = new int[] {l, r};
                    resLen = r - l + 1;
                }
                if (++countT[s.charAt(l++) - 'A'] > 0) {
                    need--;
                }
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }

    public String minWindow2(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            countT.put(c, 1 + countT.getOrDefault(c, 0));
        }
        int have = 0;
        int need = t.length();
        int[] res = new int[2];
        int resLen = Integer.MAX_VALUE;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, 1 + window.getOrDefault(c, 0));
            if (countT.containsKey(c) && window.get(c) == countT.get(c)) {
                have += 1;
            }
            while (have == need) {
                //# update our result
                if (r - l + 1 < resLen) {
                    res = new int[] {l, r};
                    resLen = r - l + 1;
                }
                char cl = s.charAt(l);
                window.put(cl, window.get(cl) - 1);
                if (countT.containsKey(cl) && window.get(cl) < countT.get(cl)) {
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
