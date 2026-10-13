class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // \\s+ matches one or more whitespace characters
        int n = words.length;

        String ans = "";

        for(int i=n-1; i>=0; i--){
            ans += words[i];

            if(i != 0) ans += " ";   
        }

        return ans;
    }
}