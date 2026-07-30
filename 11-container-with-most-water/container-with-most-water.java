class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = Integer.MIN_VALUE;

        int i=0;
        int j = n-1;
        while(i<j){
            int area = Math.min(height[i], height[j]) * (j-i);
            maxArea = Math.max(area, maxArea);
            
            if(height[j] > height[i]) i++;
            else j--;
        }

        return maxArea;
    }
}