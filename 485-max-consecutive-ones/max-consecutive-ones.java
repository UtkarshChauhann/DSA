class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int mx = 0;

        for(int i=0; i<n; i++){
            if(nums[i]==1){
                cnt++;
                mx = Math.max(mx, cnt);
            }
            else cnt = 0;
        }
        return mx;
    }
}