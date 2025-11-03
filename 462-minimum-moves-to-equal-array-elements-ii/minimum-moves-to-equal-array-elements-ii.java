class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = nums[n/2];
        int cnt = 0;

        for(int num: nums){
            cnt += Math.abs(num - median);
        }

        return cnt;
    }
}