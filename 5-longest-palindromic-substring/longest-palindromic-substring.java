class Solution {
    public String longestPalindrome(String s) { //Expand arround center
        int n = s.length();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            // Check odd-length palindrome (single center)
            String odd = expand(s, i, i);

            // Check even-length palindrome (two centers)
            String even = expand(s, i, i+1);

            if(odd.length() > ans.length()){
                ans = odd;
            }
            if(even.length() > ans.length()){
                ans = even;
            }
        }

        return ans;
    }

    public String expand(String s, int left, int right){

        // Expand outward while both characters match
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--; right++;
        }

        // Pointers moved one step beyond the valid palindrome
        // left + 1 = starting index, right = exclusive ending index
        return s.substring(left+1, right);
    }
}