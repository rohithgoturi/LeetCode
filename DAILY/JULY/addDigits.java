public class addDigits {
    public static int addDigits(int num){
        if(num == 0) return 0;

        int ans = 0;
        while(num != 0){
            ans += num%10;
            num /= 10;
        }

        if(ans <= 9) return ans;
        else return addDigits(ans);
    }

    public static void main(String[] args) {
        int num = 38;
        int result = addDigits(num);
        System.out.println("Add digits result: " + result);
    }

}
