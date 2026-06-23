public class palindromicNum {
    public static void main(String[] args) {
        int n = 121;
        boolean result = checkPalindrome(n);
        System.out.println(result);
    }

    public static boolean checkPalindrome(int n){
        int org_n = n;
        int rev = 0;

        while(n != 0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
        }

        if(org_n == rev) return true;
        
        return false;
    }
}
