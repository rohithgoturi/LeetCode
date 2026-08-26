class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            if(map.containsKey(n)) return true;
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        // for(int c : map.values()){
        //     if(c>1) return true;
        // }

        return false;
    }
}