public class SkipContinue {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i ++){
            System.out.print(i + " ");
            if (i % 2 == 0) {//( skip new line 0 2 4 6 8 => true ) it will go back to top when condition is true and haven't execute new line
                continue;
            }
            System.out.println();//new line 1 3 5 7 9
        }
    }
}
