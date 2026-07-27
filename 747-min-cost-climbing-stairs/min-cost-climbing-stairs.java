class Solution { //Memoization
    public int minCost(int[] cost, int idx, int[] dp){
        if(idx >= cost.length) return 0;

        if(dp[idx] != -1) return dp[idx];

        return dp[idx] = cost[idx] + Math.min(minCost(cost, idx+1, dp), minCost(cost, idx+2, dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(minCost(cost, 0, dp), minCost(cost, 1, dp));
    }
}