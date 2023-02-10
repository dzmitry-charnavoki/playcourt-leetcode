package problems.p0000_0100.p0044_wildcard_matching;

class Solution {
    public boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        int i = 0; //i for s
        int j = 0; //j for p
        int starIndex = -1; // begin of star(*) index
        int match = -1; // record the index of String s
        while (i < slen) {
            //if two string's i, j index character is the same or index j == ?,
            // then move i, j plus 1
            if (j < plen && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
                i++;
                j++;
                //if index j find *, record starIndex as j, move j to the next,
                // and record the current match index that
                //the following characters can be matched
            } else if (j < plen && p.charAt(j) == '*') {
                starIndex = j;
                j++;
                match = i;
                //if starIndex != -1, which means we find star(*),
                // then we move index j to starIndex,
                // we find the last
                // index that the character is matched and continue to match the next character
            } else if (starIndex != -1) {
                j = starIndex + 1;
                match++;
                i = match;
                //else: we do not find starIndex == -1 which means we do not find *;
                // and we do not find ? and i, j index's
                //character is not the same
            } else {
                return false;
            }
        }
        //if abcd a*d*, which means the last * is not used
        while (j < plen) {
            if (p.charAt(j++) != '*') {
                return false;
            }
        }
        return true;
    }


}
