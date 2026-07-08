public class scoreOfString {
     public static int getScoreOfString(String str) {
        int n = str.length();
        int score = 0;
        for(int i = 0; i<n-1; i++){
            int cur = (int) str.charAt(i) - (int) str.charAt(i+1);
            if(cur<0) cur = -cur;
            score += cur;
        }

        return score;
    }

    public static void main(String[] args) {
        String str = "hello";
        int result = getScoreOfString(str);
        System.out.println("Score of the string: " + result); 
    }

}
