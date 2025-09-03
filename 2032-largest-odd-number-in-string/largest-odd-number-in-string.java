class Solution {
    public String largestOddNumber(String s) {
        int n = s.length();
        int start = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0') start++;
            else break;
        }
       

        for(int i=n-1; i>=0; i--){
            if((s.charAt(i) - '0') % 2 == 1){
                return s.substring(start,i+1);
            }
        }
        return "";
    }
}