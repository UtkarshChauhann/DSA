class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String left = strs[0];
        String right = strs[strs.length-1];

        int n = left.length();

        for(int i=0; i<n; i++){
            if(left.charAt(i) != right.charAt(i)) return sb.toString();

            sb.append(left.charAt(i));
        }

        return sb.toString();
    }
}