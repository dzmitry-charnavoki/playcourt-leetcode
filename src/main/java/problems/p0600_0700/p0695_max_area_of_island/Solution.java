package problems.p0600_0700.p0695_max_area_of_island;

class Solution {

    private static final int FLAG_VISITED = 7;

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans = Math.max(ans, dfs(grid, i, j));
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length) {
            return 0;
        }
        if (grid[r][c] != 1) {
            return 0;
        }

        grid[r][c] = FLAG_VISITED;

        return 1
            + dfs(grid, r + 1, c)
            + dfs(grid, r, c + 1)
            + dfs(grid, r - 1, c)
            + dfs(grid, r, c - 1);
    }


}
