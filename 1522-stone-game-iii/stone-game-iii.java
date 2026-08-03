class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Integer.MIN_VALUE;
            int currentSum = 0;
            
            for (int k = 0; k < 3 && i + k < n; k++) {
                currentSum += stoneValue[i + k];
                dp[i] = Math.max(dp[i], currentSum - dp[i + k + 1]);
            }
        }
        
        int relativeScore = dp[0];
        
        if (relativeScore > 0) {
            return "Alice";
        } else if (relativeScore < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}