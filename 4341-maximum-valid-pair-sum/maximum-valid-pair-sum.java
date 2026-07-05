class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxLeft = nums[0];
        int ans = 0;

        // j starts from k because the first valid pair is (0, k)
        for(int j=k; j<n; j++){

            // For the current j, indices 0 to (j-k) are allowed.
            maxLeft = Math.max(maxLeft, nums[j-k]); //0, 1, ..j-k
            // maxLeft is the largest valid left value.
            ans = Math.max(ans, maxLeft + nums[j]);
        }

        return ans;
    }
}