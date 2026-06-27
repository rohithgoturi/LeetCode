public class peakIdxInMountainArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 45, 35, 25};

        int peakIdx = peakIdxElement(arr);
        if(peakIdx == -1) System.out.println("array is not a mountain array");
        else System.out.println("peak element is found at idx = "+peakIdx);
    }

    public static int peakIdxElement(int[] arr){
        int low = 1;
        int high = arr.length-2;
        //constraints = array size is 3<=arr.length<=10^3

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid+1;
            else high = mid-1;
        }
        
        return -1;
    }
}
