class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] freq = new char[26];

        for(char ch: text.toCharArray()){
            freq[ch - 'a']++;
        }
        int b = freq['b' - 'a'], a = freq['a' - 'a'], l = freq['l' - 'a'], o = freq['o' - 'a'], n = freq['n' - 'a'];

        int[] arr = {b, a, l/2, o/2, n};

        int ans = Integer.MAX_VALUE;

        for(int x: arr){
            ans = Math.min(ans, x);
        }

        return ans;       
    }
}