public class arrSumDivisible {
    public static int minOperations(int[] nums, int k) {
        int sum = 0;

        for(int i=0; i<nums.length; i++) sum += nums[i];

        return sum % k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(minOperations(nums, k));
    }
}
