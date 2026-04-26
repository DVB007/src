public class ContinueLabel {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1 ; i <= 3; i ++ ){//outer loop

            for (int j = 1; true; j++ ){//inner loop

                if (j == 2) {
                    // j = 2 will go back to outerLoop and haven't print j = 2
                    continue outerLoop;
                }

                //j always print j = 1
                System.out.println(" i = "+ i + " j = "+ j);
            }
        }
    }
}
