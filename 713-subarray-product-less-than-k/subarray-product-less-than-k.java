class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(nums[i] < k) cnt++;
            int prod = nums[i];
            for(int j=i+1; j<n; j++){
                prod *= nums[j];

                if(prod < k) cnt++;
                else break;
            }
        }

        return cnt++;
    }
}