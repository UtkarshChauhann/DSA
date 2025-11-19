class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, scnd = -1;;
        int ans = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                scnd = max;
                max = nums[i];
                ans = i;
            } else if(nums[i] > scnd) scnd = nums[i];
        }

        if(2*scnd > max) return -1;

        return ans;
    }
}