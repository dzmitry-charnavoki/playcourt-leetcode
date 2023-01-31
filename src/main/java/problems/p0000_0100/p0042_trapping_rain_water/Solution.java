package problems.p0000_0100.p0042_trapping_rain_water;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>(); // index of left, bottom , right
        int waterOfSection = 0;
        int heightOfSection = 0;
        int width = 0;
        int total = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peekFirst()] <= height[i]) {
                int bottomIndex = stack.removeFirst();
                if (!stack.isEmpty()) {
                    heightOfSection =
                        Math.min(height[stack.peekFirst()], height[i]) - height[bottomIndex];
                    width = i - stack.peekFirst() - 1;
                    waterOfSection = width * heightOfSection;
                    total += waterOfSection;
                }

            }
            stack.addFirst(i);
        }
        return total;
    }

    public int trapTwoPointers(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += (leftMax - height[left]);
                }
                ++left;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans += (rightMax - height[right]);
                }
                --right;
            }
        }
        return ans;
    }
}
