public class addDigits {
    public static int addingDigits(int num){
        if(num == 0) return 0;

        int ans = 0;
        while(num != 0){
            ans += num%10;
            num /= 10;
        }

        if(ans <= 9) return ans;
        else return addingDigits(ans);
    }

    public static void main(String[] args) {
        int num = 38;
        int result = addingDigits(num);
        System.out.println("Add digits result: " + result);
    }

}
