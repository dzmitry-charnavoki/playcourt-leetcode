package problems.p0400_0500.p0435_non_overlapping_intervals;

import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return 0;
        }
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
        int ans = 0;
        int curEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            final int start = intervals[i][0];
            final int end = intervals[i][1];
            if (start >= curEnd) {
                curEnd = end;
            } else {
                ans++;
                curEnd = Math.min(curEnd, end);
            }
        }
        return ans;
    }
}
