class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int a = s.length();
        int sum = 0;
        int cnt = a;

        while(n != 0){
            int lastDigit = n%10;

            if(a%2 == 0){
                if(cnt%2 == 0) sum -= lastDigit;
                else sum += lastDigit;
            }
            else{
                if(cnt%2 == 0) sum -= lastDigit;
                else sum += lastDigit;
            }
            n /= 10;
            cnt--;
        }

        return sum;
    }
}