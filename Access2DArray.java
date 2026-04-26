public class Access2DArray {
    public static void main(String[] args) {
        //int[rows][columns]
        //Initialize 2DArray instantly
        int[][] matrix = {
                {1, 2, 3},//row1
                {4, 5, 6},//row2
                {7, 8, 9}//row3
        };

        // Display
        System.out.println(matrix[0][0]);//First row
        System.out.println(matrix[1][2]);//Second row
        System.out.println(matrix[2][1]);//Third row
    }
}
