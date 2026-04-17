class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int left = 0, maxLen = 0;

        for(int right=0; right<n; right++){
            while(nums[right] - nums[left] > 1) left++;

            if(nums[right] - nums[left] == 1){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}