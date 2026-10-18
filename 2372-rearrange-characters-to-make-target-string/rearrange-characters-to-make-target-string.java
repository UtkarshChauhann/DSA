class Solution {
    public int rearrangeCharacters(String s, String target) {
        char[] freq1 = new char[26];
        char[] freq2 = new char[26];

        for(char ch: s.toCharArray()){
            freq1[ch - 'a']++;
        }
        for(char ch: target.toCharArray()){
            freq2[ch - 'a']++;
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<26; i++){
            if(freq2[i] > 0){
                ans = Math.min(ans, freq1[i] /freq2[i]);
            }
        }

        return ans;
    }
}