class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        int idx = 0;

        for(int ele: nums){
            ans[idx++] = ele;
        }
        for(int ele: nums){
            ans[idx++] = ele;
        }

        return ans;
    }
}