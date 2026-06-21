class Solution {
    public int maxDistance(String moves) {

        int x = 0, y = 0, blank = 0;

        for(char ch: moves.toCharArray()){
            if(ch == 'U') y += 1;
            else if(ch == 'D') y -= 1;
            else if(ch == 'L') x -= 1;
            else if(ch == 'R') x += 1;
            else{
                blank++;
            }
        }

        int ans = Math.abs(x) + Math.abs(y) + blank;

        return ans;
    }
}