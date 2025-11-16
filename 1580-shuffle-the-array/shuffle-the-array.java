class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int idx = 0, i = 0, j = n;

        while(i < n){
            ans[idx++] = nums[i++];
            ans[idx++] = nums[j++];
        }
        return ans;
    }
}