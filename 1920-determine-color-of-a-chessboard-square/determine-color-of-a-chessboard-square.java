class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] ch = coordinates.toCharArray();

        int n1 = (int) ch[0];
        int n2 = (int) ch[1];

        if(n1 % 2 != 0 && n2 % 2 != 0 || n1 % 2 == 0 && n2 % 2 == 0) return false;

        return true;
    }
}