public class arrangingCoins {
    // leetcode 441
    public static int sqrt(long n) {
        long low = 1;
        long high = n;

        while(low <= high){
            long mid = low + (high - low)/2;

            if(mid == n/mid) return (int) mid;
            else if(mid > n/mid) high = mid-1;
            else low = mid+1;
        }

        return (int) high;
    }
    
    public static int arrangeCoins(int n) {
        long m = (long) n;
        return (sqrt(8*m+1) - 1)/2;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }
}
