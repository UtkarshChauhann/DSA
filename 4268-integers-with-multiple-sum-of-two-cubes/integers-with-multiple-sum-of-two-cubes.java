class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        int max = (int)Math.cbrt(n);

        for(int i=1; i<=max; i++){
            int a = i*i*i;
            for(int j=i; j<=max; j++){
                int b = j*j*j;

                int sum = a+b;

                if(sum > n) break;

                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue() >= 2){
                ans.add(entry.getKey());
            }
        }

        // mp.forEach((key, value) -> {
        //     if(value >= 2){
        //         ans.add(key);
        //     }
        // });

        Collections.sort(ans);

        return ans;
    }
}