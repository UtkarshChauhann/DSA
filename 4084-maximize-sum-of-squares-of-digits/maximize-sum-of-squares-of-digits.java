
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) return "";

        int nine = sum / 9;
        int rem = sum % 9;

        StringBuilder s = new StringBuilder();

        while (nine > 0) {
            s.append('9');
            nine--;
        }

        if (rem > 0) s.append(rem);

        int i = num - s.length();

        while (i > 0) {
            s.append('0');
            i--;
        }

        return s.toString();
    }
}
