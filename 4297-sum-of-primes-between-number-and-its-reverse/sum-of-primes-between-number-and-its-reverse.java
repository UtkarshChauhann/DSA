class Solution {
    private boolean prime(int num, int x){
        if(x > Math.sqrt(num)) return true;

        if(num % x == 0) return false;

        return prime(num, x+1);
    }
    public int sumOfPrimesInRange(int n) {
        if(n < 2) return 0;
        
        int a = n;
        int r = 0;

        while(a >= 1){
            int temp = a%10;
            r = r*10 + temp;
            a /= 10;
        }

        int min = Math.min(n,r);
        int max = Math.max(n,r);
        int ans = 0;

        while(min <= max){
            if(min == 1) min++;

            if(prime(min, 2)) ans += min;

            min++;
        }

        return ans;
    }
}