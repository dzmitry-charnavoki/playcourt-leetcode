package problems.p0200_0300.p0200_number_of_islands;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    private static final char FLAG_VISITED = '*';

    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private static final int[][] dir = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };

    private void bfs(char[][] grid, int r, int c) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {r, c});
        grid[r][c] = FLAG_VISITED;
        while (!queue.isEmpty()) {
            int[] cord = queue.poll();
            final int i = cord[0];
            final int j = cord[1];
            for (int k = 0; k < dir.length; ++k) {
                final int x = i + dir[k][0];
                final int y = j + dir[k][1];
                if (x < 0 || x == grid.length || y < 0 || y == grid[0].length) {
                    continue;
                }
                if (grid[x][y] != '1') {
                    continue;
                }
                queue.offer(new int[] {x, y});
                grid[x][y] = FLAG_VISITED;
            }
        }
    }

    public int numIslands2(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = FLAG_VISITED;
        dfs(grid, i, j + 1);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i - 1, j);
    }

}