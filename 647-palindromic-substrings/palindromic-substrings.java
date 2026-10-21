class Solution {
    public int palindrome(String s, int left, int right){
        int cnt = 0;
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            cnt++;
            left--; right++;
        }

        return cnt;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;

        for(int i=0; i<n; i++){
            int odd = palindrome(s, i, i);
            int even = palindrome(s, i, i+1);

            ans += odd + even;
        }

        return ans;
    }
}