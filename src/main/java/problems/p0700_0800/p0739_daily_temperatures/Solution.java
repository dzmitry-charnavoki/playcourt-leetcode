package problems.p0700_0800.p0739_daily_temperatures;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); //
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int cur = stack.pop();
                ans[cur] = i - cur;
            }
            stack.add(i);
        }
        return ans;
    }
}
