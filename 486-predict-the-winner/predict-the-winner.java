class Solution {

    Integer[][] dp;

    public boolean predictTheWinner(int[] nums) {

        int n = nums.length;
        dp = new Integer[n][n];

        int difference = calculate(nums, 0, n - 1);

        return difference >= 0;
    }

    private int calculate(int[] nums, int i, int j) {

        if (i == j)
            return nums[i];

        if (dp[i][j] != null)
            return dp[i][j];

        int pickLeft = nums[i] - calculate(nums, i + 1, j);

        int pickRight = nums[j] - calculate(nums, i, j - 1);

        return dp[i][j] = Math.max(pickLeft, pickRight);
    }
}