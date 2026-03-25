class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0, j = n-1, pt = n-1;

        while(i <= j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];

            if(left >= right){
                ans[pt--] = left;
                i++;
            } else{
                ans[pt--] = right;
                j--;
            }
        }
        

        return ans;
    }
}