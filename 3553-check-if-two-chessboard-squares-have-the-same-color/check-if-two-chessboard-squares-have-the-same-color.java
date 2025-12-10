class Solution {
    public boolean checkTwoChessboards(String a, String b) {

        int a1 = (a.charAt(0) + a.charAt(1))% 2;
        int b1 = (b.charAt(0) + b.charAt(1)) % 2;

        return a1 == b1;
    }
}