package medium.validpalindromw;

class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s= s.replaceAll("[^a-z0-9]","");
        int left = s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==s.charAt(left)){
                left--;
                if (i>=left){
                    return true;
                }

            }else{
                return false;
            }
        }
        return true;
    }
}