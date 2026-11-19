class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        //On equaling 2 elem the smalest become 0, so we just find the max

        // Case 1: Change the 2 smallest elements
        // Third smallest becomes the new minimum
        int opt1 = nums[n - 1] - nums[2];

        // Case 2: Change the smallest and largest elements
        // Second smallest and second largest become min and max
        int opt2 = nums[n - 2] - nums[1];

        // Case 3: Change the 2 largest elements
        // Third largest becomes the new maximum
        int opt3 = nums[n - 3] - nums[0];

        // Return the minimum difference among all 3 cases
        return Math.min(opt1, Math.min(opt2, opt3)); 
    }
}