class Solution {
    private boolean isPrime(int x){
        if(x < 2) return false;

        for(int i=2; i*i<=x; i++){
            if(x % i == 0) return false; 
        }

        return true;
    }
    public int sumOfPrimesInRange(int n) {

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

            if(isPrime(min)) ans += min;

            min++;
        }

        return ans;
    }
}