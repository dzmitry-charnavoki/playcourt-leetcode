package problems.p0000_0100.p0006_zigzag_conversion;

class Solution {
    // PAYPALISHIRING 3
    // P   A   H   N
    // A P L S I I G
    // Y   I   R
    // PAHNAPLSIIGYIR
    // 01234567890123
    // PAYPALISHIRING 4
    // P     I    N
    // A   L S  I G
    // Y A   H R
    // P     I
    // PINALSIGYAHRPI

    // 01234567890123
    // PAYPALISHIRING 4
    // P     I    N
    // A   L S  I G
    // Y A   H R
    // P     I
    // PINALSIGYAHRPI
    public String convert(String s, int numRows) {
        StringBuilder ans = new StringBuilder();
        if (numRows == 1) {
            return s;
        }
        int incr = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += incr) {
                ans.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + incr - (2 * i) < s.length()) {
                    ans.append(s.charAt(j + incr - (2 * i)));
                }
            }
        }
        return ans.toString();
    }

}
