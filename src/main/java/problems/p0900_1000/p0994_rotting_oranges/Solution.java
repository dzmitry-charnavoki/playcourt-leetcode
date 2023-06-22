package problems.p0900_1000.p0994_rotting_oranges;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();
        int fresh = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        final int[][] dirs = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int time = 0;
        while (!queue.isEmpty() && fresh > 0) {
            int qs = queue.size();
            time++;
            for (int i = 0; i < qs; i++) {
                int[] rotten = queue.poll();
                for (int[] dir : dirs) {
                    int rr = rotten[0] + dir[0];
                    int rc = rotten[1] + dir[1];

                    if (rr >= 0 && rr < r && rc >= 0 && rc < c && grid[rr][rc] == 1) {
                        grid[rr][rc] = 2;
                        queue.offer(new int[] {rr, rc});
                        fresh--;
                    }

                }


            }
        }

        return fresh == 0 ? time : -1;
    }
}
