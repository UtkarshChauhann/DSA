class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int[] ans = new int[]{-1, -1};
        

        int low = 0, high = n-1;

        //first
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] >= target){
                high = mid-1;
            }
            else if(nums[mid] < target) low = mid+1;
        }

        // Check if target is found
         if (low >= nums.length || nums[low] != target) {
            return ans;  // Target not found
        }
        
        ans[0] = low;


        low = 0; high = n-1;

        //last
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] <= target){
                low = mid+1;
            }

            else if(nums[mid] > target)  high = mid-1;
        }

        ans[1] = high;
        
        return ans;
    }
}