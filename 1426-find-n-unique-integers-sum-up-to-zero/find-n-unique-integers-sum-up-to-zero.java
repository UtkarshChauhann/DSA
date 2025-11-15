class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int left = 0, right = n-1, num = 1;

        while(left < right){
            ans[left++] = num;
            ans[right--] = -num;
            num++;
        }

        return ans;
    }
}