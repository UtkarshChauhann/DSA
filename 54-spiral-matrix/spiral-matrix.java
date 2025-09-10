class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        int m = nums[0].length;

        int minr = 0, maxr = n-1;
        int minc = 0, maxc = m-1;

        while(minr <= maxr && minc <= maxc){
            if(minr <= maxr && minc <= maxc){
                for(int j=minc; j<=maxc; j++){
                    ans.add(nums[minr][j]);
                }
            }
            minr++;

            if(minr <= maxr && minc <= maxc){
                for(int i=minr; i<=maxr; i++){
                    ans.add(nums[i][maxc]);
                }
            }
            maxc--;

             if(minr <= maxr && minc <= maxc){
                for(int j=maxc; j>=minc; j--){
                    ans.add(nums[maxr][j]);
                }
            }
            maxr--;

            if(minr <= maxr && minc <= maxc){
                for(int i=maxr; i>=minr; i--){
                    ans.add(nums[i][minc]);
                }
            }
            minc++;
        }

        return ans;
    }
}