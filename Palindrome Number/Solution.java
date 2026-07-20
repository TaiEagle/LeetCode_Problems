class Solution {
    public boolean isPalindrome(int x) {
        //convert in to a string
        String xString = Integer.toString(x);
        //create string builder
        StringBuilder reverseS = new StringBuilder(xString);
        //reverse the string
        reverseS.reverse();
        //convert back to string to compare
        String reversed = reverseS.toString();
        //compare strings
        if(reversed.equals(xString)){
            return true;
        }
        return false;
    }
}