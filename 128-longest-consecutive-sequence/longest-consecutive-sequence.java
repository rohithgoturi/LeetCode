class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();

        for(int ele : nums) set.add(ele);

        int longest = 0;
        for(int ele : set){
            if(!set.contains(ele-1)){
                int count = 1;
                int curr = ele;

                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}