class Solution {
    public int[] sortArray(int[] arr) {
        if(arr == null || arr.length <= 1) return arr;

        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
        return arr;
    }

    public static void mergeSort(int[] arr, int[] temp, int low, int high){
        if(low<high){
            int mid = low + (high-low)/2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid+1, high);

            merge(arr, temp, low, mid, high);
        }
    }

    public static void merge(int[] arr, int[] temp, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;

        while(i<=mid && j<=high){
            if(arr[i]>arr[j]){
                temp[k++] = arr[j++];
            } else{
                temp[k++] = arr[i++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=high){
            temp[k++] = arr[j++];
        }

        for(int l=low; l<=high; l++) arr[l] = temp[l];
    }
}