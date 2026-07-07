public class findMaxConsecutiveOnes {
     public static int MaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = count;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else count = 0;

            if(count>maxCount) maxCount = count;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = MaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + result);
    }
}
