class Solution {
    public boolean isSubseq(String s, String w){
        int i=0, j=0;

        while(i<s.length() && j<w.length()){
            if(s.charAt(i) == w.charAt(j)){
                i++; j++;
            } else{
                i++;
            }
        }

        if(j == w.length()) return true;
        return false;
    }
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Boolean> map =  new HashMap<>();
        int ans = 0;

        for(String w: words){
            
            if(!map.containsKey(w)){
                map.put(w, isSubseq(s, w));
            }

            if(map.get(w)) ans++;
        }

        return ans;
    }
}