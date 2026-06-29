class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt = 0;

        for(String s: patterns){
            if(word.contains(s)) cnt++;
        }

        return cnt;
    }
}