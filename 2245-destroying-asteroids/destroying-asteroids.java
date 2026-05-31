class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;

        for(int num: asteroids){
            if(num <= currMass) currMass += num;
            else{
                return false;
            }
        }

        return true;
    }
}