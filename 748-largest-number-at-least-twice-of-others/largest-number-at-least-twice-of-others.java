class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                ans = i;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(i == ans) continue;
            if(nums[i] * 2 > max) return -1;
        }

        return ans;
    }
}