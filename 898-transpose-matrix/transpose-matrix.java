class Solution {
    public int[][] transpose(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] transpose = new int[m][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }
    // public static void swap(int[][] arr,int i,int j){
    //     int temp = arr[i][j];
    //     arr[i][j] = arr[j][i];
    //     arr[j][i] = temp;
    // }
}