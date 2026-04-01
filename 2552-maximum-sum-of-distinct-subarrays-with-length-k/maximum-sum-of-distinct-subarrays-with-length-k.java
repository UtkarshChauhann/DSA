class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long sum = 0, ans = 0;
        Set<Integer> s = new HashSet<>();

        for(int right=0; right<nums.length; right++){
            while(s.contains(nums[right]) || s.size() == k){
                s.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            sum += nums[right];
            s.add(nums[right]);

            if(s.size() == k){
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}