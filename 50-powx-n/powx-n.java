class Solution {
    private double pow(double x, long n){
        if(n == 0) return 1;

        double ans = pow(x,n/2);

        if(n % 2 == 0){
            return ans*ans;
        }

        return ans*ans*x;
    }
    public double myPow(double x, int n) {

        if(n < 0){
            return pow(1.0/x, n);
        }

        return pow(x, n);
    }
}