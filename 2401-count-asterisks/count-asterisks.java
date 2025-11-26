class Solution {
    public int countAsterisks(String s) {
        int cnt = 0, ans = 0;

        for(char ch: s.toCharArray()){
            if(ch == '|'){
                cnt++;
                continue;
            }
            if(ch == '*'){
                if(cnt%2 == 0) ans++;
            }
        }

        return ans;
    }
}