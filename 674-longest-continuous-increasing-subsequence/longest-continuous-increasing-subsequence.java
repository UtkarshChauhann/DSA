class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cnt = 1, max = 1;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]) cnt++;
            else cnt = 1;
            max = Math.max(max, cnt);
        }

        return max;
    }
}