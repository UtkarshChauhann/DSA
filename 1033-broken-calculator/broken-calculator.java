class Solution {
    public int brokenCalc(int start, int target) {
        int ops = 0;

        while(target > start){
            if(target % 2 == 0){
                target /= 2;
            } else target++;

            ops++;
        }

        return ops + (start - target); //for edge case where target<start
    }
}