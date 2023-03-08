package problems.p0000_0100.p0064_minimum_path_sum;

class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int r = row - 1; r >= 0; r--) {
            for (int c = col - 1; c >= 0; c--) {
                if (r == row - 1) {
                    if (c < col - 1) {
                        grid[r][c] = grid[r][c] + grid[r][c + 1];
                    }
                } else if (c == col - 1) {
                    grid[r][c] = grid[r][c] + grid[r + 1][c];
                } else {
                    grid[r][c] = grid[r][c] + Math.min(grid[r + 1][c], grid[r][c + 1]);
                }
            }
        }

        return grid[0][0];
    }

}
