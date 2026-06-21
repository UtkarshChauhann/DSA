class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;

        for(int x: costs){
            max = Math.max(max, x);
        }

        int[] count = new int[max + 1];

        for(int x: costs){
            count[x]++;
        }

        int idx = 0;

        for(int i=0; i<=max; i++){
            while(count[i] > 0){
                costs[idx++] = i;

                count[i]--;
            }
        }

        int ans = 0;

        for(int x: costs){
            if(x > coins) break;

            coins -= x;
            ans++;
        }

        return ans;
    }
}