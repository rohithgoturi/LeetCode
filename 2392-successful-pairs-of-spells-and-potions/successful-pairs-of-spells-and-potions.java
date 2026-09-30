class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];

        for(int i = 0;i<n;i++){
            int spell = spells[i];
            int high = m-1;
            int low = 0;
            while(low<=high){
                int mid = low + (high-low)/2;
                long product = (long) spell * potions[mid];

                if(product >= success){
                    high = mid-1;
                }
                else{
                    low = mid + 1;
                }
            }
            pairs[i] = m-low;
        }

        return pairs;
    }
}