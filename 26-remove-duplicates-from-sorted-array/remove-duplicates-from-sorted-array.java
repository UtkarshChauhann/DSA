class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for(int x: nums){
            if(nums[k-1] != x){
                nums[k] = x;
                k++;
            }
        }

        return k;
    }
}