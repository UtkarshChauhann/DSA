class Solution {
    public int memo(int i, int j, int[][] obs, int[][] dp){
        if(i < 0 || j < 0) return 0;

        if(obs[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1; 
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int row = memo(i-1, j, obs, dp);
        int col = memo(i, j-1, obs, dp);

        return dp[i][j] = row + col;
    }
    public int uniquePathsWithObstacles(int[][] obs) {
        int m = obs.length;
        int n = obs[0].length;

        int[][] dp = new int[m+1][n+1];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return memo(m-1, n-1, obs, dp);
    }
    
}