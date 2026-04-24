class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int sum = 0;

        for(char c: moves.toCharArray()){
            if(c == 'L') sum -= 1;
            else if(c == 'R') sum += 1;
        }

        if(sum >= 0){
            for(char c: moves.toCharArray()){
                if(c == '_') sum += 1;
            }
        } else{
            for(char c: moves.toCharArray()){
                if(c == '_') sum -= 1;
            }
        }

        int ans = Math.abs(sum);

        return ans;
    }
}