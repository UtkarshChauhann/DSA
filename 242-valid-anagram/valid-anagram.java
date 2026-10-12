class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int n = s.length();
        int[] arr = new int[26];
    
        for(int i=0; i<n; i++){
            char cc = s.charAt(i);
            char ch = t.charAt(i);

            arr[cc - 'a']++;
            arr[ch - 'a']--;
        }

        for(int x: arr){
            if(x != 0) return false;
        }

        return true;
    }
}