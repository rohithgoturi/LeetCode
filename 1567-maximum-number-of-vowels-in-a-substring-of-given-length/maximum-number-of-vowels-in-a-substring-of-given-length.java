class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0; i<k; i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) count++;
        }

        int maxCount = count;
        for(int i=k; i<s.length(); i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i-k);

            if(isVowel(ch)) count++;
            if(isVowel(ch2)) count--;

            maxCount = Math.max(count, maxCount); 
        }

        return maxCount;
    }

    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}