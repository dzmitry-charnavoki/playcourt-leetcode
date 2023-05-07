package problems.p1900_2000.p1964_find_the_longest_valid_obstacle_course_at_each_position;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> tail = new ArrayList<>();

        for (final int obstacle : obstacles) {
            if (tail.isEmpty() || obstacle >= tail.get(tail.size() - 1)) {
                tail.add(obstacle);
                ans.add(tail.size());
            } else {
                final int index = bsPosition(tail, obstacle);
                tail.set(index, obstacle);
                ans.add(index + 1);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private int bsPosition(List<Integer> list, int target) {
        int l = 0;
        int r = list.size();
        while (l < r) {
            final int m = (l + r) / 2;
            if (list.get(m) > target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
