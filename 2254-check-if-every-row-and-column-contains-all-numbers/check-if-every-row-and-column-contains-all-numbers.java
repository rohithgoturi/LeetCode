class Solution {
    public boolean checkValid(int[][] matrix) {

        for(int i=0; i<matrix.length; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0; j<matrix[0].length; j++){
                if(set.contains(matrix[i][j])) return false;

                set.add(matrix[i][j]);
            }
        }

        for(int i=0; i<matrix.length; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0; j<matrix.length; j++){
                if(set.contains(matrix[j][i])) return false;

                set.add(matrix[j][i]);
            }
        }

        return true;
    }
}