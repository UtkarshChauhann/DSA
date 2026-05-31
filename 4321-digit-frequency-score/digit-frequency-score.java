class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer, Integer> hm = new HashMap<>();

        while(n > 0){
            int num = n%10;
            n /= 10;

            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int ans  = 0;

        for(var entry: hm.entrySet()){
            ans += (entry.getKey() * entry.getValue());
        }

        return ans;
    }
}