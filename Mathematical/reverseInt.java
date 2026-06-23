public class reverseInt {
    public static void main(String[] args) {
        int n = 1439999666;
        System.out.println(n);
        int reversed = reverse(n);
        System.out.println(reversed);
    }

    public static int reverse(int n){
        long rev = 0;

        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;

        return (int) rev;
    }
}
