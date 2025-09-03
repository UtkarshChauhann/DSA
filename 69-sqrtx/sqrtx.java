class Solution {
    public int mySqrt(int x) {
        
        if (x == 0 || x == 1) return x;
            
        int low = 1, high = x;

        while(low <= high){
            int mid = low + (high-low)/2;
            
            long square = (long)mid*mid;

            if(square == x) return mid;

            if(square < x)  low = mid+1;

            else high  = mid-1; 
        }
        return high;
    }
}