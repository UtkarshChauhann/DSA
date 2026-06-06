class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(int i=0; i<n; i++){
            int left = 0;
            for(int j=0; j<i; j++){
                left += nums[j];
            }
            leftSum[i] = left;

            int right = 0;
            for(int k=i+1; k<n; k++){
                right += nums[k];
            }
            rightSum[i] = right; 
        }

        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}