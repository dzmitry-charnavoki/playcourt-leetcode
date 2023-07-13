package problems.p0100_0200.p0134_gas_station;

import java.util.Arrays;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = Arrays.stream(gas).sum();
        int totalCost = Arrays.stream(cost).sum();
        if (totalGas < totalCost) {
            return -1;
        }
        int ans = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
}
