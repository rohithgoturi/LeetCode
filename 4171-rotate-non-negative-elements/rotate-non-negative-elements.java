class Solution {
    public int[] rotateElements(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr) {
            if(x >= 0) list.add(x);
        }

        int n = list.size();
        if(n == 0) return arr;

        k%=n;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = list.get((idx + k) % n);
                idx++;
            }
        }

        return arr;
    }
}