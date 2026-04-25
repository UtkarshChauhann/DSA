class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        long leftSum = nums[0], rightSum = nums[n-1];

        for(int i=1; i<n; i++){
            if(nums[i-1] < nums[i]) leftSum += nums[i];

            else if(nums[i-1] > nums[i]) rightSum += nums[i-1];
        }

        if(leftSum > rightSum) return 0;
        else if(leftSum < rightSum) return 1;

        return -1;
    }
}