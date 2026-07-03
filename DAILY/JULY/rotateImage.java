public class rotateImage {
    //rotating image by 90 degree clockwise
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        //transpose
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse colwise
        for (int i = 0; i < arr.length; i++) {
            int startCol = 0;
            int endCol = arr[0].length-1;
            while(startCol < endCol){
                int temp = arr[i][startCol];
                arr[i][startCol] = arr[i][endCol];
                arr[i][endCol] = temp;

                startCol++;
                endCol--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}