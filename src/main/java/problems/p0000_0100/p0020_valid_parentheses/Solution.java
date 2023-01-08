package problems.p0000_0100.p0020_valid_parentheses;

import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = Map.of(
            '[', ']',
            '(', ')',
            '{', '}');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pair = brackets.get(stack.pop());
                if (pair != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
