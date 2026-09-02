class Solution {
    public int memo(int i, int j, int[][] dp){
        if(i == 1 || j == 1) return 1; 
        
        if(dp[i][j] != -1) return dp[i][j];

        int row = memo(i-1, j, dp);
        int col = memo(i, j-1, dp);

        return dp[i][j] = row + col;
    }
    public int uniquePaths(int m, int n) { // ** revise => pw
        int[][] dp = new int[m+1][n+1];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return memo(m, n, dp);
    }
}