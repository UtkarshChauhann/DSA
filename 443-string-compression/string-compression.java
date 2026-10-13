class Solution {
    public int compress(char[] chars) {
        StringBuilder ans = new StringBuilder("");
        ans.append(chars[0]);

        char ch = chars[0];
        int cnt = 1;

        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];

            if (c != ch) {
                if (cnt > 1) {
                    ans.append(cnt);
                }

                ch = c;
                ans.append(ch);
                cnt = 1;
            } else {
                cnt++;
            }
        }

        // Handle the last group
        if (cnt > 1) {
            ans.append(cnt);
        }

        // Copy compressed string to original array
        for (int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }

        return ans.length();
    }
}

/*char ch = chars[0];
        String s = "chars[0]";
        int cnt = 1;

        for(int i=1; i<chars.length; i++){
            char c = chars[i];
            if(c != ch){
                if(cnt > 1) s += cnt;
                
                ch = c;
                s += ch;
                cnt = 1;
            }
            else cnt++;
        }

        for(int i=0; i<s.length(); i++){
            chars[i] = s.charAt(i);
        }

        return s.length(); */