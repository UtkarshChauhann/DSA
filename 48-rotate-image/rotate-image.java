class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        
        //reversing inside row

        for(int i=0; i<n; i++){
            int low=0, high=m-1;
            while(low < high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++; high--;
            }
        }
        
    }
}