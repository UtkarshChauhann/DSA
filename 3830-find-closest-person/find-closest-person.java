class Solution {
    public int findClosest(int x, int y, int z) {
        int xDist = Math.abs(z-x);
        int yDist = Math.abs(z-y);

        if(xDist < yDist) return 1;
        if(xDist > yDist) return 2;
        else return 0;


        
    }
}