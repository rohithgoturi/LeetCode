public class getConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
        }

        int j = n;
        for(int i=0; i<nums.length; i++){
            ans[j] = nums[i];
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        
        int[] result = getConcatenation(nums);
        System.out.print("Concatenated array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
