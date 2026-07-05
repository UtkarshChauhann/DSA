class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int leftMin = nums[0];
        int ans = -1;

        for(int j=1; j<n; j++){
            if(nums[j] > leftMin){
                ans = Math.max(ans, nums[j] - leftMin);
            }

            leftMin = Math.min(leftMin, nums[j]);
        }

        return ans;
    }
}