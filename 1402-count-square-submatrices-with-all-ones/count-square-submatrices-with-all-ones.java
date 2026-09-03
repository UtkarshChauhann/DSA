class Solution { //revise
    public int countSquares(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int cnt = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0) continue;

                else if(i > 0 && j > 0){
                    arr[i][j] = arr[i][j] + Math.min(arr[i-1][j-1], Math.min(arr[i-1][j], arr[i][j-1]));  
                }
                cnt += arr[i][j];
            }
        }

        return cnt;
    }
}