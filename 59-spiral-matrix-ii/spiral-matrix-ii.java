class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];


        int minr = 0, maxr = n-1;
        int minc = 0, maxc = n-1;
        int num = 1;

        while(minr <= maxr && minc <= maxc){
            if(minr <= maxr && minc <= maxc){
                for(int j=minc; j<=maxc; j++){
                    nums[minr][j] = num;
                    num++;
                }
            }
            minr++;

            if(minr <= maxr && minc <= maxc){
                for(int i=minr; i<=maxr; i++){
                    nums[i][maxc] = num;
                    num++;
                }
            }
            maxc--;

             if(minr <= maxr && minc <= maxc){
                for(int j=maxc; j>=minc; j--){
                    nums[maxr][j] = num;
                    num++;
                }
            }
            maxr--;

            if(minr <= maxr && minc <= maxc){
                for(int i=maxr; i>=minr; i--){
                    nums[i][minc] = num;
                    num++;
                }
            }
            minc++;
        }

        return nums;
    }
}