class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);

        StringBuilder res = new StringBuilder();

        for(char bit : binary.toCharArray()){
            res.append(bit == '0'?'1':'0');
        }

        return Integer.parseInt(res.toString(), 2);
    }
}