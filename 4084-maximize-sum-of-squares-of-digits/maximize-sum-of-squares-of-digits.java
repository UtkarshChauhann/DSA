
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) return "";

        int nine = sum / 9;
        int rem = sum % 9;

        StringBuilder s = new StringBuilder();

        s.append("9".repeat(nine));

        if (rem > 0) s.append(rem);

        s.append("0".repeat(num - s.length()));

        return s.toString();
    }
}
