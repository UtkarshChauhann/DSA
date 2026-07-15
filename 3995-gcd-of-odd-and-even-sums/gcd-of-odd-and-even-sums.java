class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0;

        for(int i=1; i<=2*n; i+=2){
            sumOdd += i;
        } 
        for(int i=2; i<=2*n; i+=2){
            sumEven += i;
        } 

        int b = sumOdd, a = sumEven;

        while(b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}