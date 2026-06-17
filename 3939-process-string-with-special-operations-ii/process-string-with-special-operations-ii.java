class Solution {
    public char processStr(String s, long k) {

        // Pass 1:
        // Compute only the final length of the string.
        // We never build the actual string because its length
        // can be as large as 1e15.
        long len = 0;

        for (char ch : s.toCharArray()) {

            if(ch == '*'){ 
                if(len > 0) len--;
            }

            else if(ch == '#') len *= 2;

            else if(ch == '%') continue;

            else len++;
        }

        // k is outside the final string
        if (k >= len) return '.';

        // Pass 2:
        // Walk backwards and keep converting k
        // to the index it came from before each operation.
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch == '#') {
                // Forward: abc -> abcabc
                // Backward: First restore old length.
                len /= 2;

                // If k lies in the second copy, map it to the corresponding index in the first copy.
                if (k >= len) {
                    k = k - len;
                }
            }

            else if (ch == '*') {
                // Forward: abc -> ab
                // Backward: Restore length before deletion. No need to modify k because surviving characters keep same indices.

                len++;
            }

            else if (ch == '%') {
                // Forward: abc -> cba
                // Backward: Reverse index mapping.
                k = len - k - 1;
            }

            else {

                // Forward: oldString + ch
                // This character was appended at index = oldLength.
                len--;

                if (k == len) {
                    return ch;
                }
            }
        }

        return '.';
    }
}