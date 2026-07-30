class Solution {
    public boolean isPalindrome(String s) {
        boolean check = false;
        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(res.length() <= 1) return true;

        int i = 0;
        int j = res.length()-1;

        while(i<=j){
            if(res.charAt(i) == res.charAt(j)) check = true;
            else return false;
            i++;
            j--;
        }

        return check;
    }
}