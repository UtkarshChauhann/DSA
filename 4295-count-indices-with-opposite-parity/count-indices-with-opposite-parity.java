class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int odd = 0, even = 0;

        for(int i=n-1; i>=0; i--){
            if(nums[i] % 2 == 0) {
                ans[i] = even;
                odd++;
            }
            else {
                ans[i] = odd;
                even++;
            }
        }

        return ans;
    }
}