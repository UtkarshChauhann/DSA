class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while(n != 0){
            int lastdigit = n%10;

            product *= lastdigit;
            sum += lastdigit;

            n /= 10;
        }

        return product - sum;
    }
}