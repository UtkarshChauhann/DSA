class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int cnt = 1, i = 0, j = 1;

        while(j < n){
            if(nums[i] == nums[j]) j++;
            else{
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                cnt++;
            }
        }

        return cnt;
    }
}