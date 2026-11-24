class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2 == 0) return n;

        int i = n;
        while(i <= n*2){
            if(i%2 == 0 && i%n == 0) return i;
            else i++;    
        }

        return -1;
    }
}