package problems.p0000_0100.p0028_find_the_index_of_the_first_occurrence_in_a_string;

class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        char n = needle.charAt(0);
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == n) {
                int in = 1;
                while (in < needle.length() && needle.charAt(in) == haystack.charAt(i + in)) {
                    in++;
                }
                if (in == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
