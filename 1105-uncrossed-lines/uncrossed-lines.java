class Solution {
     public int memo(int[][] dp, int[] nums1, int[] nums2, int i, int j){
        if(i == nums1.length || j == nums2.length) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        if(nums1[i] == nums2[j]) return 1 + memo(dp, nums1, nums2, i+1, j+1);

        return dp[i][j] = Math.max(memo(dp, nums1, nums2, i+1, j) , memo(dp, nums1, nums2, i, j+1));

        
    }
   
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int dp[][] = new int[n+1][m+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return memo(dp, nums1, nums2, 0, 0);
    }
}