class Solution {
    public int digitFrequencyScore(int n) {

        int freq[]=new int[10];
        
        while(n > 0){
            int d = n%10;
            freq[d]++;
            n=n/10;
        }

        int ans =0;

        for(int i=0;i<10;i++){
            ans += i*freq[i];
        }

        return ans;
    }
}