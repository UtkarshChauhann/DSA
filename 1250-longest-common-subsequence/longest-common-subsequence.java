class Solution {
    public int memo(int[][] dp, String s1, String s2, int i, int j){
        if(i == s1.length() || j == s2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return 1 + memo(dp, s1, s2, i+1, j+1);

        return dp[i][j] = Math.max(memo(dp, s1, s2, i+1, j) , memo(dp, s1, s2, i, j+1));

        
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return memo(dp, s1, s2, 0, 0);
    }
}