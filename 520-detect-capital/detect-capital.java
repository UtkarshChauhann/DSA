class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) return true;
        if(word.equals(word.toLowerCase())) return true;

        char a = word.charAt(0);

        if(Character.isUpperCase(a)){

            for(int i=1; i<word.length(); i++){
                char ch = word.charAt(i);
                if(Character.isUpperCase(ch)) return false;
            }
        }
        if(Character.isLowerCase(a)){

            for(int i=1; i<word.length(); i++){
                char ch = word.charAt(i);
                if(Character.isUpperCase(ch)) return false;
            }
        }
        

        return true;
    }
}