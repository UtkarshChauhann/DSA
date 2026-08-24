class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int dSum = 0, prod = 1;

        while(a > 0){
            int digit = a%10;
            dSum += digit;
            prod *= digit;
            a /= 10;
        }

        int sum = dSum + prod;

        if(n % sum == 0) return true;

        return false;
    }
}