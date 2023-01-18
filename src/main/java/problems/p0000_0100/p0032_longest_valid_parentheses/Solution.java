package problems.p0000_0100.p0032_longest_valid_parentheses;

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        //)()())
        if (s.isEmpty()) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }

        }
        return ans;
    }
}
