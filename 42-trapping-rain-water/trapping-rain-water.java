class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int lmax = height[0];
        int rmax = height[n-1];
        int water = 0;

        int i = 1, j = n-1;

        while(i <= j){
            lmax = Math.max(lmax, height[i]);
            rmax = Math.max(rmax, height[j]);

            if(lmax <= rmax){
                water += lmax - height[i];
                i++;
            } else{
                water += rmax - height[j];
                j--;
            }
        }

        return water;
            
    }
}