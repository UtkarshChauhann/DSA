class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDif = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            minDif = Math.min(minDif, arr[i]-arr[i-1]);
        }

        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<n; i++){
            if(arr[i] - arr[i-1] == minDif) ans.add(Arrays.asList(arr[i-1], arr[i]));
        }

        return ans;
    }
}