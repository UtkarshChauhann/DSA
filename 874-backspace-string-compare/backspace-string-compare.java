class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '#'){
                if(!s1.isEmpty()) s1.pop();
            } 
            else {
                s1.push(ch);
            }
        }

       for(char ch: t.toCharArray()){
            if(ch == '#'){
                if(!s2.isEmpty()) s2.pop();
            } 
            else {
                s2.push(ch);
            }
        } 

        while(!s1.isEmpty() && !s2.isEmpty()){
            char a = s1.pop();
            char b = s2.pop();

            if(a != b) return false;
        }

        return (s1.isEmpty() && s2.isEmpty());
    }
}