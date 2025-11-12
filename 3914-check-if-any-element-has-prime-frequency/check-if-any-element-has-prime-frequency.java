class Solution {
    private boolean prime(int num, int n){
        if(num <= 1) return false;
        
        if(n > Math.sqrt(num)){
            return true;
        }
        if(num % n == 0) return false;

        return prime(num, n+1);
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num,0) + 1);
        }

        for(int num: hm.values()){
            if(prime(num, 2)) return true;
        }

        return false;
    }
}