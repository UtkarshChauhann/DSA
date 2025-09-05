class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2; // to find sum of first n no.

        int arrSum = 0;

        for(int i=0; i<n; i++){
            arrSum += nums[i];
        }

        return totalSum - arrSum; // this will give the missing no.
    }
}
