class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        int n = arr.length;
        if(n == 1) return 1;
        
        int ans = 0;
        

        for(int i=0; i<n; i++){
            int a = arr[i][0];
            int b = arr[i][1];
            boolean flag = false;
            for(int j=0; j<n; j++){
                if(i == j) continue;
                else{
                    int c = arr[j][0];
                    int d = arr[j][1];

                    if(a >= c && b <= d){
                        flag = false;
                        break;
                    } else{
                        flag = true;
                    }
                }
            }
            if(flag) ans++;
        }

        return ans;
    }
}