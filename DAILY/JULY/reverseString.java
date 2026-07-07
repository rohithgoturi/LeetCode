public class reverseString {
    public static void revString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        System.out.println("Reversed array: " + new String(s));
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original array: " + new String(s));
        revString(s);
    }
}
