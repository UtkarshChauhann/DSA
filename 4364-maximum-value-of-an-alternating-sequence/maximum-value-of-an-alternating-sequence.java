class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n == 1) return s;
        long k = (n - 2L) / 2;

        return (long) s + (k+1)*m - k;
    }
}