class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n+1];

        for(int i=n-1; i>=0; i--){
            suf[i] = nums[i] + suf[i+1];
        }
        
        int leftSum = 0;

        for(int i=0; i<n; i++){
            if(leftSum == suf[i+1]) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}