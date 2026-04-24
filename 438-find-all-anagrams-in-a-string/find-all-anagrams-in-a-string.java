class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        char[] freq1 = new char[26];
        char[] freq2 = new char[26];

        for(char c: p.toCharArray()){
            freq1[c - 'a']++;
        }

        List<Integer> ans = new ArrayList<>();
        int left = 0, right = 0;

        while(right < n){
            while(right-left+1 > m){
                freq2[s.charAt(left) - 'a']--;
                left++;
            }

            freq2[s.charAt(right) - 'a']++;

            if(right-left+1 == m && Arrays.equals(freq1, freq2)){
                ans.add(left);
            }
            right++;
        }

        return ans;
    }
}