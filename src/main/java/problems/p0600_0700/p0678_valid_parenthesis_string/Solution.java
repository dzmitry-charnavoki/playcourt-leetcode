package problems.p0600_0700.p0678_valid_parenthesis_string;

import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>(); // indexes instead of chars
        Stack<Integer> stars = new Stack<>(); // indexes instead of chars
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left.push(i);
            } else if (c == ')') {
                if (!left.isEmpty()) {
                    left.pop();
                } else if (!stars.isEmpty()) {
                    stars.pop();
                } else {
                    return false;
                }
            } else {
                stars.push(i);
            }
        }

        while (!left.isEmpty() && !stars.isEmpty()) {
            if (left.pop() > stars.pop()) {
                return false;
            }
        }
        return left.isEmpty();
    }
}
