class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int sum = 0, blank = 0;

        for(char c: moves.toCharArray()){
            if(c == 'L') sum -= 1;
            else if(c == 'R') sum += 1;
            else if(c == '_') blank++;
        }

        int ans = Math.abs(sum) + blank;

        return ans;
    }
}