class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int cnt = 0, ans = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == ' ') cnt = 0;
            else{ 
                cnt++;
                ans = cnt;
            }
        }

        if(s.charAt(n-1) == ' ') return ans;

        return ans;
    }
}