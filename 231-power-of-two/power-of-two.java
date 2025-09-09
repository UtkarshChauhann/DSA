class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n==0) return false;
        while(n%2==0) n/=2;
        return n==1;
        
        //wrong
        // for(int i=0; i<n; i++){
        //     if(Math.pow(2,i) == n) return true;
        // }
        // return false;
    }
}