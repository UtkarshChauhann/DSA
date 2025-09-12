class Solution {
    public int smallestEvenMultiple(int n) {
        // int m = Integer.MAX_VALUE;
        // for(int i=1; i<m; i++){
        //     if(i%2 == 0 && i%n == 0) return i;
        // }
        // return -1;

        if(n%2 == 0) return n;
        if(n%2 == 1) return 2*n;

        return -1;
    }
}