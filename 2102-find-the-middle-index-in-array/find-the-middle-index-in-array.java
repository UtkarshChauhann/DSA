class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum = 0;
        int total = 0;

        for(int i = 0 ; i < nums.length ; i++){
            total+=nums[i];
        }

        for(int i = 0 ; i < nums.length ; i++){
            int rightSum = total -leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }
            leftSum+=nums[i];   
        }

        return -1;
    }
}