class Solution {
    public int maxProduct(int n) {
        int mx1 = -1;
        int mx2 = -1;
        int[] freq = new int[10];

        while(n != 0){
            int digit = n%10;
            freq[digit]++;

            if(digit > mx1){
                mx2 = mx1;
                mx1 = digit;
            }else if(digit > mx2 && digit < mx1){
                mx2 = digit;
            }
            n /= 10;
        }

        if(freq[mx1] >=2) return mx1*mx1;

        return mx1*mx2;

    }
}