class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele : nums) map.put(ele, map.getOrDefault(ele, 0)+1);

        for(Integer key : map.keySet()){
            if(map.get(key) > nums.length/2) return key;
        }

        return -1;
    }
}