class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;

        for(int i=0; i<n; i++){
            int cnt = 0;
            HashSet<Character> h = new HashSet<>();
            for(int j=i; j<n; j++){
                if(!h.contains(s.charAt(j))){
                    h.add(s.charAt(j));
                    cnt++;
                } else { 
                    break;
                }

                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}