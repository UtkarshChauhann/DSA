class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int ans = 0;

        while(left <= right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h*w;
            ans = Math.max(ans, area);

            if(height[left] < height[right]) left++;
            else right--;
        }

        return ans;
    }
}