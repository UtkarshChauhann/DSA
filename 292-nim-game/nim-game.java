class Solution {
    public boolean canWinNim(int n) {
        // You lose only when n is a multiple of 4
        return n%4 != 0;
    }
}