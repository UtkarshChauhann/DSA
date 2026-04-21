class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        char[] s1_freq = new char[26];
        char[] s2_freq = new char[26];

        for(char c: s1.toCharArray()){
            s1_freq[c - 'a']++;
        }

        int left = 0, right = 0;

        while(right < m){
            while(right-left+1 > n){
                s2_freq[s2.charAt(left) - 'a']--;
                left++;
            }

            s2_freq[s2.charAt(right) - 'a']++;

            if(right-left+1 == n && Arrays.equals(s1_freq, s2_freq)){
                return true;
            }
            right++;
        }

        return false;
    }
}