package problems.p0000_0100.p0084_largest_rectangle_in_histogram;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            while (!stack.isEmpty()
                && (i == heights.length || heights[stack.peekFirst()] > heights[i])) {
                int prevIndex = stack.removeFirst();
                int height = heights[prevIndex];
                int width = stack.isEmpty() ? i : i - stack.peekFirst() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.addFirst(i);
        }

        return maxArea;
    }
}
