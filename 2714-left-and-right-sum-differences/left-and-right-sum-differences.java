class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int totalSum = 0;
        
        for(int i: nums){
            totalSum += i;
        }

        int[] ans = new int[n];
        int leftSum = 0;

        for(int i=0; i<n; i++){
            totalSum -= nums[i]; //rightSum

            ans[i] = Math.abs(leftSum - totalSum);

            leftSum += nums[i];
        }

        return ans;
    }
}