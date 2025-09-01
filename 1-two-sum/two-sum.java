class Solution {
    public int[] twoSum(int[] nums, int k) {
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j] == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}