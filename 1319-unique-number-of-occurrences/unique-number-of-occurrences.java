class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int x: arr){
            mp.put(x, mp.getOrDefault(x, 0)+1);
        }

        Set<Integer> set = new HashSet<>();

        for(int x: mp.values()){
            if(set.contains(x)) return false;

            set.add(x);
        }

        return true;
    }
}