public class PyramidStarPattern {
    public static void main(String[] args) {
        //declare n time to run of i
        int n = 5;// 5 rows

        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n - i; j++){//Print spaces
                System.out.print("   ");
            }
            for (int j = 1 ; j <= 2 * i - 1 ; j++){//Print stars
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
