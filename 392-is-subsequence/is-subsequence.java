class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n == 0) return true;
        if(m == 0) return false;
        int idx = 0;

        for(int i=0; i<m; i++){
            if(s.charAt(idx) == t.charAt(i)) idx++;

            if(idx == n) return true;
        }

        return false;
    }
}