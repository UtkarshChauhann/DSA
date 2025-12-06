class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;

        for(int num: nums){
            sum += num;
        }

        int leftSum = 0, rightSum = 0, count = 0;

        for(int i=0; i<nums.length-1; i++){
            leftSum += nums[i];
            rightSum = sum - leftSum;

            if(leftSum % 2 == rightSum % 2) count ++;
        }

        return count;
    }
}