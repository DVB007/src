public class ForLoop {
    public static void main(String[] args) {
        int n = 5;//Number of rows

        for (int i = 1; i <= n*n ; i++ ){
            //it'll print * until false but every i%n == 0 it'll break line
            System.out.print("*");
            if (i % n == 0){
                System.out.println();//Break line after every 'n' stars
            }
        }
    }
}
