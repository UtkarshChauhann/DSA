class Solution {
    public int passwordStrength(String password) {

        Set<Character> s = new HashSet<>();

        int ans = 0;

        for (char ch : password.toCharArray()) {

            if (Character.isLowerCase(ch) && !s.contains(ch)) {
                s.add(ch);
                ans += 1;
            }
            else if (Character.isUpperCase(ch) && !s.contains(ch)) {
                s.add(ch);
                ans += 2;
            }
            else if (Character.isDigit(ch) && !s.contains(ch)) {
                s.add(ch);
                ans += 3;
            }
            else if ((ch == '!' || ch == '@' || ch == '#' || ch == '$') && !s.contains(ch)) {
                s.add(ch);
                ans += 5;
            }
        }

        return ans;
    }
}