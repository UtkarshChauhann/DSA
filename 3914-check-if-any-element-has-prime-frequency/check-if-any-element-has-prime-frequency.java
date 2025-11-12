class Solution {
    private boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
}

    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num,0) + 1);
        }

        for(int num: hm.values()){
            if(isPrime(num)) return true;
        }

        return false;
    }
}