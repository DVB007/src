import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println(" Enter number : ");
        num = scanner.nextInt();

        //Using Ternary Operator
        String result = ( num % 2 == 0 ) ? " Even " : " Odd ";
        System.out.print(" \n The number is : " + result);
    }
}
