
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        List<Integer> ans = new ArrayList<>();
        if (m > n) return ans;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : p.toCharArray()) {
            freq1[c - 'a']++;
        }

        int left = 0;

        for(int right=0; right < n; right++) {
            if (right - left + 1 > m) {
                freq2[s.charAt(left) - 'a']--;
                left++;
            }

            freq2[s.charAt(right) - 'a']++;

            if (right - left + 1 == m && Arrays.equals(freq1, freq2)) {
                ans.add(left);
            }
        }

        return ans;
    }
}
