package problems.p0000_0100.p0069_sqrtx;

class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        if (x <= 1) {
            return x;
        }

        while (l < r) {
            final int m = (r - l) / 2 + l;
            if (m == x / m) {
                return m;
            } else if (m > x / m) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l - 1;
    }
}
