class Solution {
    public int climbStairs(int n, int[] costs) {
        
        int s0 = 0;
        int s1 = 0;
        int s2 = 0;

        for(int curr : costs){
            int next = Math.min(s0+9,Math.min(s1+4,s2+1)) + curr;
            s0 = s1;
            s1 = s2;
            s2 = next;
        }

        return s2;
    }
}