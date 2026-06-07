class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;

        int left = Math.max(1, n - k);
        int right = n + k;

        for (int x = left; x <= right; x++) {
            if ((n & x) == 0) {
                sum += x;
            }
        }

        return sum;
    }
}