import java.util.Arrays;

class Solution {

    int fun(int i, int j, int m, int n,
            int[][] grid, int[][] dp) {

        // Outside grid
        if (i >= m || j >= n) {
            return 0;
        }

        // Obstacle
        if (grid[i][j] == 1) {
            return 0;
        }

        // Destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = fun(i + 1, j, m, n, grid, dp);
        int right = fun(i, j + 1, m, n, grid, dp);

        return dp[i][j] = down + right;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(0, 0, m, n, obstacleGrid, dp);
    }
}