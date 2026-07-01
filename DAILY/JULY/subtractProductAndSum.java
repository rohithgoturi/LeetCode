public class subtractProductAndSum {
    public static int subProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while(n != 0){
            int digit = n%10;
            product = product*digit;
            sum = sum + digit;
            n = n/10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        int n = 234;
        int result = subProductAndSum(n);
        System.out.println("Result: " + result);
    }

}
