class Solution {
    public String digitSum(String s, int k) {
        String currentString = s;
        
        while (currentString.length() > k) {
            StringBuilder newString = new StringBuilder();
            
            for (int start = 0; start < currentString.length(); start += k) {
                int end = Math.min(start + k, currentString.length());
                String chunk = currentString.substring(start, end);
                
                int digitTotal = 0;
                for (int index = 0; index < chunk.length(); index++) {
                    char letter = chunk.charAt(index);
                    int number = letter - '0';
                    digitTotal += number;
                }
                
                newString.append(digitTotal);
            }
            
            currentString = newString.toString();
        }
        
        return currentString;
    }
}