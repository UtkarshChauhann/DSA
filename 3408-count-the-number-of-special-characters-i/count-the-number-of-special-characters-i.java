class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        for(char ch: word.toCharArray()){
            if(Character.isLowerCase(ch)) lower.add(ch);
            else upper.add(Character.toLowerCase(ch));
        }

        int cnt = 0;

        for(char ch: lower){
            if(upper.contains(ch)) cnt++;
        }

        return cnt;
    }
}