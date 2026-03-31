class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE, sum = 0, avg = 0;
        int left = 0;    

        for(int right=0; right<nums.length; right++){
            if(right-left+1 > k){
                sum -= nums[left];
                left++;
            }

            sum += nums[right];

            if(right-left+1 == k){
                avg = sum/k;
                maxAvg = Math.max(maxAvg, avg);
            }
        }     

        return maxAvg;
    }
}