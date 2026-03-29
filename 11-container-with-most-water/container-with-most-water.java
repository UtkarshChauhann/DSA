class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int ans = 0, water = 1;

        while(left < right){
            if(height[left] <= height[right]){
                water = height[left] * (right - left);
                left++;
            }
            else{
                water = height[right] * (right - left);
                right--;
            }

            ans = Math.max(ans, water);
        }

        return ans;
    }
}