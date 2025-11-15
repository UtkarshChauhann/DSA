class Solution {
    private int square(int n){
        int ans = 0;
        while(n != 0){
            int num = n%10;
            ans += num*num;
            n /= 10;
        }

        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        } while(slow != fast);

        return slow == 1;
    }
}