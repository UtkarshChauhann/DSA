class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int ans = 0, area = 0;

        while(left < right){
            if(height[left] <= height[right]){
                area = height[left] * (right - left);
                left++;
            } else{
                area = height[right] * (right - left);
                right--;
            }

            ans = Math.max(ans, area);
        }

        return ans;
    }
}