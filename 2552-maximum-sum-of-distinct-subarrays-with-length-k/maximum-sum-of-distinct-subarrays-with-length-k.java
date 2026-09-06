class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long curr = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (i >= k) {
                int outNum = nums[i - k];
                curr -= outNum;
                map.put(outNum, map.get(outNum) - 1);
                if (map.get(outNum) == 0) {
                    map.remove(outNum);
                }
            }

            if (i >= k - 1 && map.size() == k) {
                max = Math.max(max, curr);
            }
        }

        return max;
    }
}