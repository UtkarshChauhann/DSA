class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i=0, j=n-1;
        
        while(i < j){
            if(Character.isUpperCase(arr[i])) arr[i] = Character.toLowerCase(arr[i]);
            if(Character.isUpperCase(arr[j])) arr[j] = Character.toLowerCase(arr[j]);
            if(arr[i] != arr[j]) return false;

            i++; j--;
        }

        return true;
    }
}