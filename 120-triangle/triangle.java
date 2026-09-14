class Solution {
    public int memo(List<List<Integer>> t, int i, int j, int[][] dp){
        if(i == t.size() -1) return t.get(i).get(j);

        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        return dp[i][j] = t.get(i).get(j) + Math.min(memo(t, i+1, j, dp), memo(t, i+1, j+1, dp));
    }
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int[][] dp = new int[n][n*2];

        for(int[] row: dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        return memo(t, 0, 0, dp);
    }
}