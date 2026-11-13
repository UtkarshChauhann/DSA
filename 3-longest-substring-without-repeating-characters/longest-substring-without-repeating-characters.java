class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0, ans = 0;

        for(int right=0; right<n; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}