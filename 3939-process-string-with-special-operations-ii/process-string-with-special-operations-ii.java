class Solution {
    public char processStr(String s, long k) {
        long len = 0;

        for(char ch: s.toCharArray()){
            if(ch == '*'){ 
                if(len > 0) len--;
            }

            else if(ch == '#') len *= 2;

            else if(ch == '%') continue;

            else len++;
        }

        if(k >= len) return '.';

        for(int i=s.length()-1; i>=0; i--){  
            char ch = s.charAt(i);

            if(ch == '#'){
                len /= 2;
                if(k >= len) k = k - len;
            }

            else if(ch == '*') len++;

            else if(ch == '%'){
                k = len-k-1;
            }

            else{
                len--;
                if(k == len) return ch;
            }
        }

        return '.';
    }
}