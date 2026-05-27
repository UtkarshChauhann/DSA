class Solution {
    public String thousandSeparator(int n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));

        for(int i=s.length()-3; i>0; i=i-3){
            s.insert(i, ".");
        }

        return s.toString();
    }
}