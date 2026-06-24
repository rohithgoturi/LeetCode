public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeros(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}
