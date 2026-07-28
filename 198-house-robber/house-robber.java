class Solution { //Memoisation
    private int helper(int[] nums, int idx, int[] dp){
        if(idx < 0) return 0;

        if(dp[idx] != -1) return dp[idx];

        return dp[idx] = Math.max(helper(nums, idx-1, dp)/*curr skip*/, nums[idx] + helper(nums, idx-2, dp) /*take*/);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        
        return helper(nums, n-1, dp);
    }
}