package problems.p0000_0100.p0008_string_to_integer_atoi;

class Solution {
    public int myAtoi(String s) {
        long v = 0;
        int cur = 0;
        int sign = 1;

        while (cur < s.length() && s.charAt(cur) == ' ') {
            cur++;
        }
        if (cur == s.length()) {
            return 0;
        }
        if (s.charAt(cur) == '-') {
            cur++;
            sign = -1;
        } else if (s.charAt(cur) == '+') {
            cur++;
        }

        while (cur < s.length() && s.charAt(cur) >= '0' && s.charAt(cur) <= '9') {
            int digit = s.charAt(cur) - '0';
            if (digit == 0 && v == 0) {
                cur++;
                continue;
            }
            v = v * 10 + digit;
            if (sign * v > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * v < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            cur++;
        }

        return (int) (sign * v);
    }

}
