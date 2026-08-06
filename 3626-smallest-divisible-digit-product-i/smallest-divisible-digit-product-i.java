class Solution {
    public int smallestNumber(int n, int t) {
        int x = n;
        while (true) {
            if (getProduct(x) % t == 0) {
                return x;
            }
            x++;
        }
    }

    private int getProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }
        return product;
    }
}