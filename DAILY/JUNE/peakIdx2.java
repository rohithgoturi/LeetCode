public class peakIdx2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 45, 35, 25, 15, 5};

        int peakIdx = peakElementIdx(arr);
        if(peakIdx == -1) System.out.println("Given array is not a mountain array");
        else System.out.println("peak element found at index = "+peakIdx);
    }

    public static int peakElementIdx(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        
        while(low<high){
            int mid = low + (high - low)/2;
            if(arr[mid]>arr[mid+1]) high = mid;
            else low = mid+1;
        }

        return low;
    }
}
