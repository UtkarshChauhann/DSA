class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];

        for(int d: digits){
            freq[d]++;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=1; i<=9; i++){
            if(freq[i] == 0) continue;
            freq[i]--;
            
            for(int j=0; j<=9; j++){
                if(freq[j] == 0) continue;
                freq[j]--;

                for(int k=0; k<=8; k+=2){
                    if(freq[k] == 0) continue;
                    int num = 100*i + 10*j + k;
                    ans.add(num);
                }
                freq[j]++;
            }
            freq[i]++;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}