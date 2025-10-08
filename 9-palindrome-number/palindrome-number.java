class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num = 0;
        int copy = x;

        while(x != 0){
            int lastDigit = x%10;
            num = num*10 + lastDigit;
            x /= 10;
        }

        if(num == copy) return true;

        return false;
        
    }
}