public class arrangingCoins {
    // leetcode 441
    
    public static int arrangeCoins(int n) {
        int low = 0;
        int high = n;

        while(low <= high){
            long mid = low + (high - low)/2;
            long coins = mid * (mid + 1) / 2;

            if(coins == n) return (int)mid;
            else if(coins < n) low = (int)mid + 1;
            else high = (int)mid - 1;
        }

        return high;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }
}
