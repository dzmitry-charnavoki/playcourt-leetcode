package problems.p0000_0100.p0007_reverse_integer;

class Solution {
    public int reverse(int x) {
        long r = 0;
        int t = x;
        while (t != 0) {
            r = r * 10 + t % 10;
            t /= 10;
        }
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) r;
    }
}
