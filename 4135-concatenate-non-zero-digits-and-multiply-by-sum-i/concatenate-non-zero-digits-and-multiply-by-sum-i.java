class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        long digit = 1;

        while(n > 0){
            long num = n%10;
            sum += num;


             if(num != 0){
                x += num*digit;
                digit *= 10;
            }

            n /= 10;
        }

        return x * sum;
    }
}