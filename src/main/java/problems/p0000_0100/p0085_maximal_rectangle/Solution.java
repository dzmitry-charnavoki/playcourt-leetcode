package problems.p0000_0100.p0085_maximal_rectangle;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    @SuppressWarnings("CPD-START")
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

    @SuppressWarnings("CPD-END")
    public int maximalRectangle(char[][] matrix) {

        int ans = 0;
        int[] hist = new int[matrix[0].length];

        for (char[] row : matrix) {
            for (int i = 0; i < row.length; ++i) {
                hist[i] = row[i] == '0' ? 0 : hist[i] + 1;
            }
            ans = Math.max(ans, largestRectangleArea(hist));
        }

        return ans;
    }

}
