package problems.p0200_0300.p0202_happy_number;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = n;
        while (!set.contains(sum)) {
            set.add(sum);
            sum = squaredSum(sum);
            if (sum == 1) {
                return true;
            }
        }
        return false;
    }

    private int squaredSum(int in) {
        int out = 0;
        while (in != 0) {
            int l = in % 10;
            in /= 10;
            out += l * l;
        }
        return out;
    }

}
