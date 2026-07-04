public class binarySearch {
    public static int bSearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 20;

        int targetIdx = bSearch(arr, target);
        if(targetIdx == -1) System.out.println("target element is not found");
        else System.out.println("target element is found at "+targetIdx);
    }
}
