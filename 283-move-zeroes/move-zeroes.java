class Solution {
    public void swap(int[] nums, int low, int high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                swap(nums, i, k);
                // if(nums[k] != 0) 
                k++;
            }
        }
    }
}