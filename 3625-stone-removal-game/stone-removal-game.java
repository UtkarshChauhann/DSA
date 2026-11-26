class Solution {
    public boolean canAliceWin(int n) {
        int turn = 10;
        
        while(n >= 0){
            if(turn % 2 == 0){
                if(turn <= n){
                    n -= turn;
                    turn--;
                } else{
                    return false;
                }
            } else{
                n -= turn;
                turn--;
            }
            
        }

        return true;
    }
}