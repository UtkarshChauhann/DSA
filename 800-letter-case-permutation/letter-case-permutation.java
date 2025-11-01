class Solution {
    private void converted(int idx, char[] chars, List<String> ans){
        if(idx == chars.length){
            ans.add(new String (chars));
            return;
        }

        if(Character.isLetter(chars[idx])){
            chars[idx] = Character.toLowerCase(chars[idx]);
            converted(idx+1, chars, ans);
            chars[idx] = Character.toUpperCase(chars[idx]);
        }
        converted(idx+1, chars, ans);
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();

        converted(0, s.toCharArray(), ans);

        return ans;
    }
}