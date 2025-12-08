class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;

        int left = 0, right = people.length-1;

        while(left <= right){
            int sum = people[left] + people[right];
            if(sum <= limit){
                ans++;
                left++; right--;
            } 
            else{
                ans++;
                right--;
            }
        }
        return ans;
    }
}