class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> h = new HashSet<>();
        int left = 0, ans = 0;

        for(int i=0; i<n; i++){
            while(h.contains(s.charAt(i))){
                h.remove(s.charAt(left));
                left++;
            }

            h.add(s.charAt(i));

            ans = Math.max(ans, i-left + 1);
            
        }
        return ans;
    }
}