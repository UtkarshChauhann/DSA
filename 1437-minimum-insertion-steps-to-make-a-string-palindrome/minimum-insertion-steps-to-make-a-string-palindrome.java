class Solution {
    public int memo(String s, int i, int j, int[][] dp){
        if(i >= j) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == s.charAt(j)) return dp[i][j] = memo(s, i+1, j-1, dp);
        
        return dp[i][j] = 1 + Math.min(memo(s, i+1, j, dp), memo(s, i, j-1, dp));
        
    }
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return memo(s, 0, n-1, dp);
    }
}