class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> set = new HashSet<>();

        for(int ele : nums1) set.add(ele);

        Set<Integer> ans = new HashSet<>();
        for(int ele : nums2){
            if(set.contains(ele)) ans.add(ele);
        }

        int[] arr = new int[ans.size()];
        int idx = 0;
        for(int num : ans) arr[idx++] = num;
        
        return arr;
    }
}