class Solution {
    public boolean validDigit(int n, int x) {
        boolean flag = false;
        int start = -1;

        while(n > 0){
            int num = n%10;
            n /= 10;

            start = num;
            if(num == x) flag = true;
        }

        if(flag && start != x) return true;

        return false;
    }
}