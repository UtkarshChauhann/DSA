class Solution {
    public String intToRoman(int num) {
        int[] values   =   {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int n = values.length;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<n; i++){
            while(num - values[i] >= 0){
                ans.append(symbols[i]);
                num -= values[i];
            }
        } 

        return ans.toString();
    }
}