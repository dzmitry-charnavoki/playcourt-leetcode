package problems.p0000_0100.p0057_insert_interval;

import java.util.ArrayList;
import java.util.List;

class Solution {
    // [[1,2],[6,9]], newInterval = [3,5]
    // [[1,3],[6,9]], newInterval = [2,5]
    // [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
    public int[][] insert(int[][] intervals, int[] newInterval) {
        final int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int i = 0;

        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i++]);
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            ++i;
        }
        ans.add(newInterval);

        while (i < n) {
            ans.add(intervals[i++]);
        }

        return ans.toArray(int[][]::new);
    }
}
