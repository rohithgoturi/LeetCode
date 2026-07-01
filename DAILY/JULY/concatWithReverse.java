public class concatWithReverse {
    public static int[] concat(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
        }

        int j = n;
        for(int i=nums.length-1; i>=0; i--){
            ans[j] = nums[i];
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = concat(nums);
        System.out.print("Concatenated array with reverse: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
