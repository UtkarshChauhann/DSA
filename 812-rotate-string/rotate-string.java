class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() == 1){
            if(s.equals(goal)) return true;
        }
        int n = s.length();

        for(int i=0; i<n; i++){
            String str = s.substring(i) + s.substring(0,i);

            if(str.equals(goal)) return true;
        }
        return false;
    }
}