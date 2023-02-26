package problems.p0000_0100.p0060_permutation_sequence;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        int[] fact = new int[n + 1]; // fact[i] := i!
        fact[0] = 1;

        for (int i = 1; i <= n; ++i) {
            nums.add(i);
            fact[i] = fact[i - 1] * i;
        }

        --k;

        for (int i = n - 1; i >= 0; --i) {
            final int j = k / fact[i];
            k %= fact[i];
            sb.append(nums.get(j));
            nums.remove(j);
        }

        return sb.toString();
    }
}
