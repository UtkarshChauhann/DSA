class Solution {
    public int partitionString(String s) {
        int cnt = 0;
        Set<Character> set = new HashSet<>();

        for(int right=0; right<s.length(); right++){
            if(set.contains(s.charAt(right))){
                cnt++;
                set.clear();
            }

            set.add(s.charAt(right));

        }

        return ++cnt;
    }
}