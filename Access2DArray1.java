public class Access2DArray1 {
    public static void main(String[] args) {
        //initialize
        int[][] matrix = {
                {1, 2, 3},//row1
                {4, 5, 6},//row2
                {7, 8, 9}//row3
        };

        //Display using for-each
        for (int[] matrix1 : matrix) {
            //convert 2D int[][] to 1D int[]
            // Loop through rows
            for (int i : matrix1) {
                //convert 1D int[] to normal int
                // Loop through columns
                System.out.print(i + " ");
            }
            System.out.println();// Move to next line after finish
        }
    }
}
