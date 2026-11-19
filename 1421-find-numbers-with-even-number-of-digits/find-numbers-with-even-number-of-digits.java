class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;

        for(int i=0; i<nums.length; i++){
            int count = countDigits(nums[i]);
            if(count%2==0) c++;
        }

        return c;
    }

    public int countDigits(int n){
        int c = 0;
        while(n!=0){
            n /= 10;
            c++;
        }

        return c;
    }
}