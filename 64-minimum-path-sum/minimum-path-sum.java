class Solution {
    public int memo(int i, int j, int[][] grid, int[][] dp){
        if(i == 0 && j == 0) return  grid[i][j]; 

         if(i < 0 || j < 0) return Integer.MAX_VALUE;
        
        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = grid[i][j] + Math.min(memo(i-1, j, grid, dp), memo(i, j-1, grid, dp));
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return memo(m-1, n-1, grid, dp);
    }
}