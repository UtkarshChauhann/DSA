class Solution {
    public int passwordStrength(String password) {

        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        Set<Character> digit = new HashSet<>();
        Set<Character> special = new HashSet<>();

        int ans = 0;

        for (char ch : password.toCharArray()) {

            if (Character.isLowerCase(ch) && !lower.contains(ch)) {
                lower.add(ch);
                ans += 1;
            }
            else if (Character.isUpperCase(ch) && !upper.contains(ch)) {
                upper.add(ch);
                ans += 2;
            }
            else if (Character.isDigit(ch) && !digit.contains(ch)) {
                digit.add(ch);
                ans += 3;
            }
            else if ((ch == '!' || ch == '@' || ch == '#' || ch == '$') && !special.contains(ch)) {
                special.add(ch);
                ans += 5;
            }
        }

        return ans;
    }
}