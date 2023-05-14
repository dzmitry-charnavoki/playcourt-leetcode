package problems.p0100_0200.p0155_min_stack;

import java.util.Stack;

class MinStack {

    Stack<int[]> stack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[] {val, val});
        } else {
            stack.push(new int[] {val, Math.min(val, stack.peek()[1])});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
