public class pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        double ans = myPow(x,n);
        System.out.println(ans);
    }

     public static double power(double x, long N){
        if(N==0) return 1;
        double ans = 0;
        double call = power(x, N/2);
        if(N%2 == 0) return call*call;
        else return call*call*x;
    }

    public static double myPow(double x, int n) {
        long N = n;
        if(N<0){
            N = -N;
            return 1/power(x,N);
        }

        return power(x,N);
    }

    
}
