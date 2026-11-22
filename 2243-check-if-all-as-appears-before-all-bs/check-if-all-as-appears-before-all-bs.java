class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'a' && set.contains('b')) return false;

            set.add(ch);
        }

        return true;
    }
}