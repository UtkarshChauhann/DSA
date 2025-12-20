class Solution {
    public int minimizedStringLength(String s) {
        boolean[] friend = new boolean[26];
        for (char c : s.toCharArray())
            friend[c - 'a'] = true;
        int cnt = 0;
        for (int i = 0; i < 26; ++i)
            if (friend[i])
                cnt++;
        return cnt;
    }
}