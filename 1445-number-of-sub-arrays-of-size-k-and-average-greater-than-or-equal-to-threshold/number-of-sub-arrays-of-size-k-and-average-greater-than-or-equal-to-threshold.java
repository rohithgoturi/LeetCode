class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int windowSum = 0;
        int count = 0;
        for(int i=0; i<k; i++) windowSum += arr[i];
        if(windowSum/k >= t) count++;

        for(int i=k; i<arr.length; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];

            if(windowSum / k >= t) count++;
        }

        return count;
    }
}