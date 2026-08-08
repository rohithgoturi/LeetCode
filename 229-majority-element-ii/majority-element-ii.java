class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> ans = new ArrayList<>();

        for(Integer key : map.keySet()){
            if(map.get(key) > n/3) ans.add(key);
        }

        return ans;

    }
}