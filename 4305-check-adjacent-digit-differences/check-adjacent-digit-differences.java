class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length();
        
        for (int i=0; i<n-1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) > 2) {
                return false;
            }
        }
        return true;
    }
}