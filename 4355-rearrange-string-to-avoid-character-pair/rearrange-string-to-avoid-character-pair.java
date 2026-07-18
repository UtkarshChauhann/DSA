class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] freq = new char[26];
        
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }

        StringBuilder t = new StringBuilder();

        while(freq[y - 'a'] != 0){
            t.append(y);
            freq[y - 'a']--;
        }

        for(int i=0; i<26; i++){
            while(freq[i] != 0){
                t.append((char)(i+'a'));
                freq[i]--;
            }
        }

        return t.toString();
    }
}