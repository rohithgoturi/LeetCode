class Solution {
    public int countDistinctIntegers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int ele : arr) set.add(ele);

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int rev = 0;

            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }

            set.add(rev);
        }

        return set.size();
    }
}