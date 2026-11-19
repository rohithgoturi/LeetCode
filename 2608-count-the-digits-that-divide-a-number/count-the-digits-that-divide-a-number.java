class Solution {
    public int countDigits(int num) {
        int org = num;
        int c = 0;
        while(num != 0){
            int digit = num%10;
            if(org % digit == 0) c++;

            num/=10;
        }

        return c;
    }
}