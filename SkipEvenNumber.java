import java.util.Scanner;

public class SkipEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter number : ");
        int number = scanner.nextInt();

        for (int i = 1 ; i <= number; i++ ){
            if (i % 2 == 0) {
                continue;//Skip even numbers
            }
            System.out.print(" "+ i);//1 3 5 7 9
        }
    }
}
