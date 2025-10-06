class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=lowLimit; i<=highLimit; i++){
            int sum = 0;
            int num = i;

            while(num != 0){
                sum += num%10;
                num /= 10;
            }

            hm.put(sum, hm.getOrDefault(sum, 0) +1);
        }

        int mx = 0;

        for(int ele: hm.values()){
            mx = Math.max(mx, ele);
        }

        return mx;
    }
}