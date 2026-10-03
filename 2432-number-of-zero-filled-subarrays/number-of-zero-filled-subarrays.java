class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long cnt = 0, zero = 0;

        for(int i=0; i<n-1; i++){
            if(nums[i] == 0){
                cnt++;

                if(nums[i+1] == 0){
                    zero++;
                    cnt += zero;
                }
                 else zero = 0;
            }
        }
        if(nums[n-1] == 0) cnt++;

        return cnt;
    }
}