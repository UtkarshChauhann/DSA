class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == original){
                original = 2*original;
                i = -1;
            }
        }

        return original;
    }
}